package com.bot.responses;

import java.util.HashMap;

public class Response {
    private static HashMap<String, String> publicResp = new HashMap<>();

    private static HashMap publicRespMap(){
        publicResp.put("whats-up", "Whats up?");
        return publicResp;
    }

    public static String publicRespKey(String mapKey){
        publicRespMap().keySet();
        return publicResp.get(mapKey);
    }
}
