package com.acat.chat.socket;

import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/chatSocket")
public class ChatSocket {
	
	private String username;
	
	@OnOpen
	public void open(Session session){
		String queryName = session.getQueryString();
		System.out.println(queryName);
		username = queryName.split("=")[1];
		System.out.println(username);
	}
}
