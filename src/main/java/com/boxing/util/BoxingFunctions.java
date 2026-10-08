package com.boxing.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.boxing.model.Boxing;
import com.boxing.model.Configurations;
import com.boxing.model.Match;
import com.boxing.service.BoxingService;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BoxingFunctions {
	
	@SuppressWarnings("resource")
	public static List<PrintWriter> processPrintWriter(Configurations config) throws UnknownHostException, IOException
	{
		List<PrintWriter> print_writer = new ArrayList<PrintWriter>();
		
		if(config.getPrimaryIpAddress() != null && !config.getPrimaryIpAddress().isEmpty()) {
			print_writer.add(new PrintWriter(new Socket(config.getPrimaryIpAddress(), 
				config.getPrimaryPortNumber()).getOutputStream(), true));
		}
		
		if(config.getSecondaryIpAddress() != null && !config.getSecondaryIpAddress().isEmpty()) {
			print_writer.add(new PrintWriter(new Socket(config.getSecondaryIpAddress(), 
				config.getSecondaryPortNumber()).getOutputStream(), true));
		}
		
		return print_writer;
	}
	
	public static String convertminintosecs(String time) {
		return String.valueOf(((Long.valueOf(time.split(":")[0])*60000)+ Long.valueOf(time.split(":")[1])*1000));
	}
	
	public static String convertclocktime(Long duration) {
		long mins,secs;
		String time="";
		
		mins = (duration/60000);
		secs = ((duration/1000) - (mins*60));
		
		time += "" + mins + ":" + (secs < 10 ? "0" : "");
		time += "" + secs;
		
		return time;
	}
	
	public static String twoDigitString(long number) {
	    if (number == 0) {
	        return "00";
	    }
	    if (number / 10 == 0) {
	        return "0" + number;
	    }
	    return String.valueOf(number);
	}
	
	public static String replace(float number) {
	    return String.valueOf(number).replace(".0", "");
	}
	
	public static Match populateMatchVariables(BoxingService wrestlingService, Match match)
	{
		if(match.getHomeFirstPlayerId() > 0) {
			match.setHomeFirstPlayer(wrestlingService.getPlayer(match.getHomeFirstPlayerId()));
		}
		if(match.getAwayFirstPlayerId() > 0) {
			match.setAwayFirstPlayer(wrestlingService.getPlayer(match.getAwayFirstPlayerId()));
		}
		return match;
	}
	
	public static String getOnlineCurrentDate() throws IOException
	{
		HttpURLConnection httpCon = (HttpURLConnection) new URL("https://mail.google.com/").openConnection();
		return new SimpleDateFormat("yyyy-MM-dd").format(new Date(httpCon.getDate()));
	}
	
	public static Boxing readFromUrl(String urlString) throws IOException 
    {
        HttpURLConnection conn = null;
        URL url = new URL(urlString);
        conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");
        conn.setConnectTimeout(10_000);
        conn.setReadTimeout(10_000);
        try {
            if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                return new ObjectMapper().readValue(conn.getInputStream(), Boxing.class);
            }
        }
        finally {
            if (conn != null) conn.disconnect();
        }
    	return null;
    }
}
