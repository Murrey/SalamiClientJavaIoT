package it.bway.salami.communication;

import java.util.List;

import it.bway.salami.Callback;

public class SalamiSubscriber
    {
        private String url;
        private List<Callback> subscribers;
        private ClientWebSocket websocketClient;
        public CancellationTokenSource token = new CancellationTokenSource();
        private Callback callback;
        public SalamiSubscriber(String url, Callback callback)
        {
            this.url = url;
            this.callback = callback;
            this.websocketClient = subscribe(url, callback);
            this.subscribers = new List<Callback>();
        }
        public ClientWebSocket subscribe(String url, Callback callback)
        {
            ClientWebSocket client = new ClientWebSocket();
            client.ConnectAsync(new Uri(url), token.Token);
            this.subscribers.Add(callback);
            return client;
        }
        public void publish(String message)
        {
            ArraySegment<byte> byteMessage = new ArraySegment<byte>(Encoding.UTF8.GetBytes(message));
            this.websocketClient.SendAsync(byteMessage, WebSocketMessageType.Binary, true, token.Token);
        }
        public void onMessage(ClientWebSocket ws, String message)
        {
            for(Callback callback : subscribers)
            {
                callback(message);
            }
        }
        public void onError(ClientWebSocket ws, SalamiMessage message)
        {
        }
        public void disconnect()
        {
            this.websocketClient.CloseAsync(WebSocketCloseStatus.NormalClosure, "normal exit", token.Token);
        }
    }
