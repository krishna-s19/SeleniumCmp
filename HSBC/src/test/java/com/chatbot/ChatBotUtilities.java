package com.chatbot;

import java.util.HashMap;
import java.util.Map;

public class ChatBotUtilities {

    private static final Map<String, String> responses;

    static {
        responses = new HashMap<>();
        responses.put("Hi", "Hello!");
        responses.put("How are you", "Great to see you here!");
        responses.put("What are you doing?", "I'm here to assist you.");
    }

    public static String getResponse(String qustion) {
        String answer = responses.getOrDefault(qustion.toLowerCase(), "Sorry , I don't understand.");
        return answer;
    }
}