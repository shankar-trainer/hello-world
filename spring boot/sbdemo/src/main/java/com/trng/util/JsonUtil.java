package com.trng.util;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JsonUtil {
    private JsonUtil() {
    }

    public static String toJson(Object jsonObject) {
        Gson gson = new Gson();
        try {
            return gson.toJson(jsonObject);
        } catch (JsonSyntaxException ex) {
            log.error("Object to JSOn convert error {} ", ex.getMessage());
        }
        return null;
    }
}
