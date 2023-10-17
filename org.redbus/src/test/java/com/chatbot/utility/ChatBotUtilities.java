package com.chatbot.utility;

import java.util.HashMap;
import java.util.Map;

public class ChatBotUtilities {

	
	public static Map<String,String> responses;
	static{
		responses = new HashMap<>();
		responses.put("hi","Hello!");
		responses.put("how are you","Great to see you here!");
		responses.put("What are you doing","I'm here to assit you");
	}
	public static String getResponse(String question) {
		String answer = responses.getOrDefault(question.toLowerCase(), "Sorry i don't understand");
		return answer;
	}
}