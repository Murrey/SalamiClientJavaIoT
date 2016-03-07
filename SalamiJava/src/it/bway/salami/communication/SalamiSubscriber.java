package it.bway.salami.communication;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import it.bway.salami.Callback;
import it.bway.salami.model.SalamiMessageAdapter;

public class SalamiSubscriber
    {
        private String url;
        private List<Callback> subscribers;
        private Socket websocketClient;
        private Callback callback;
        /**
         * Questa classe viene chiamata per inviare e ricevere dati dal server
         * @param url
         * @param callback
         */
        		
        public SalamiSubscriber(String url, Callback callback)
        {
            this.url = url;
            this.callback = callback;
            this.websocketClient = subscribe(url, callback);
            this.subscribers = new ArrayList<Callback>();
        }
        public Socket subscribe(String url, Callback callback)
        {

            Socket client = null;
			try {
				URI path = new URI(this.url);
				client = new Socket(path.getHost(),path.getPort());
			} catch (IOException | URISyntaxException e) {
				e.printStackTrace();
			}
            this.subscribers.add(callback);
            return client;
        }
        /**
         * Invio Stringa al server
         * @param message
         */
        public void publish(String message)
        {
        	try {
				PrintStream out = new PrintStream(this.websocketClient.getOutputStream(), true);
				out.print(message);
				out.flush();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
//            ArraySegment<byte> byteMessage = new ArraySegment<byte>(Encoding.UTF8.GetBytes(message));
//            this.websocketClient.SendAsync(byteMessage, WebSocketMessageType.Binary, true, token.Token);
        }
        public void onMessage(Socket ws, String message)
        {
            for(Callback callback : subscribers)
            {
//                callback(message);
            }
        }
        public void onError(Socket ws, SalamiMessageAdapter message)
        {
        }
        public void disconnect()
        {
    		try {
				this.websocketClient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
        }
    }
