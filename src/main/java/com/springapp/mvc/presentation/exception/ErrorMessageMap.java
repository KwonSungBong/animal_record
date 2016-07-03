package com.springapp.mvc.presentation.exception;

import lombok.Getter;

import java.util.HashMap;

@Getter
public class ErrorMessageMap {
    private static HashMap<Integer, String> messageMap = new HashMap<>();

    static {
        messageMap.put(400, "400");
        messageMap.put(404, "404");
        messageMap.put(405, "405");
        messageMap.put(500, "500");
        messageMap.put(502, "502");

        messageMap.put(1, "1");
        messageMap.put(2, "2");
    }

    public String getMessage(int code) {
        return messageMap.get(code);
    }
}
