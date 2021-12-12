package com.home.formatter;

import com.home.enums.FormatType;

public class FormatterFactory {

    public static IFormatter initFormat(String format) {
        IFormatter formatter = null;
        if(format.equalsIgnoreCase(FormatType.JSON.label)){
            formatter = new JsonFormatter();
        }
        if(format.equalsIgnoreCase(FormatType.XML.label)) {
            formatter = new XmlFormatter();
        }
        return formatter;
    }
}
