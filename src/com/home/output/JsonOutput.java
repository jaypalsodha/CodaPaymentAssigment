package com.home.output;

import com.google.gson.JsonObject;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class JsonOutput implements IOutput{

    String data;
    public JsonOutput() {
    }

    public JsonOutput(String data) {
        this.data = data;
    }

    @Override
    public void printResult() {
        FileWriter file = null;
        try {
            file = new FileWriter("output.json");
            file.write(this.data);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                file.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }


    }
}
