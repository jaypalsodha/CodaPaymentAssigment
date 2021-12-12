package com.home.formatter;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.home.ContentExtractor;
import org.apache.commons.lang3.StringUtils;

import java.math.BigInteger;
import java.util.List;

public class JsonFormatter implements IFormatter {

    @Override
    public String format(List<String[]> csvData) {
        List<String> headers = ContentExtractor.extractHeader(csvData);
        JsonArray jsonArray = new JsonArray();
        for (int i = 1; i < csvData.size(); i++) {
            int headerIndex = 0;
            JsonObject jsonObject = new JsonObject();
            for (String token : csvData.get(i)) {
                if (StringUtils.isNumeric(token)) {
                    jsonObject.addProperty(headers.get(headerIndex), BigInteger.valueOf(Long.valueOf(token)));
                }
                else {
                    jsonObject.addProperty(headers.get(headerIndex), token);
                }
                headerIndex++;
            }
            jsonArray.add(jsonObject);
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("data", jsonArray);
        return jsonObject.toString();
    }
}
