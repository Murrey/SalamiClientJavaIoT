package it.bway.salami.communication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Calendar;

import it.bway.salami.communication.ResponseAdapter;

public class SalamiHttpClient
{
    private String url;
    public SalamiHttpClient(String url)
    {
        this.url = url;
    }
    /**
     * Legge la ricetta dal server e la restituisce incapsulata in ResponseAdapter
     * @return
     */
    public ResponseAdapter get()
    {
    	String response = null;
    	try 
    	{
	    	URI serverUrl = new URI(url);
	    	Calendar calendar = Calendar.getInstance();
			// open a socket connection
	    	@SuppressWarnings("resource")
			Socket socket = new Socket(serverUrl.getHost() + "?" +calendar.getTimeInMillis(), serverUrl.getPort());
			// Apre i canali I/O
	    	BufferedReader in = new BufferedReader(
						new InputStreamReader(socket.getInputStream()));
	        response = in.readLine();
			in.close();
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
        return new ResponseAdapter(response);
    }
}

