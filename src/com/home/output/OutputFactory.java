package com.home.output;

import com.home.enums.FormatType;

public class OutputFactory {
    public static IOutput initOutput(String format, String result) {
        IOutput output = null;
        if(format.equalsIgnoreCase(FormatType.JSON.label)){
            output = new JsonOutput(result);
        }
        if(format.equalsIgnoreCase(FormatType.XML.label)) {
            output = new XmlOutput(result);
        }
        return output;
    }
}
