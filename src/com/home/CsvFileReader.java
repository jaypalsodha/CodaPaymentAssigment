package com.home;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvFileReader {

    public static List<String[]> read(String fileName) {
        CSVReader reader = null;
        List<String[]> lines = new ArrayList<>();
        try {
            reader = new CSVReader(new FileReader(fileName));
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                lines.add(nextLine);
            }
        } catch (IOException e) {
            System.out.println("IOException while readNext:" + e.getMessage());
        }
        return lines;
    }
}
