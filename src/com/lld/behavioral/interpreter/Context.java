package com.lld.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private final Map<String,Integer> contextMap = new HashMap<>();
    public void put (String key, Integer value) {
        contextMap.put(key,value);
    }
    public Integer get (String key) {
        return contextMap.get(key);
    }
}
