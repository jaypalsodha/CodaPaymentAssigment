package com.home;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ContentExtractor {

    public static List<String> extractHeader(List<String[]> lines) {
        if (lines.isEmpty()) {
            throw new NullPointerException("CSV file is empty");
        }
        return Arrays.stream(lines.get(0)).collect(Collectors.toList());
    }
}
