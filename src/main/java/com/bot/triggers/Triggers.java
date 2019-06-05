package com.bot.triggers;

import java.util.HashMap;

public class Triggers {
    private final static String PREFIX = "!";
    private static HashMap<String, String> triggers = new HashMap<>();

    private static HashMap triggerMap() {
        triggers.put("hello", PREFIX + "hello");
        return triggers;
    }

    public static String triggerKeys(String mapkey){
        triggerMap().keySet();
        return triggers.get(mapkey);
    }
}
