package com.home;

import com.home.formatter.FormatterFactory;
import com.home.formatter.IFormatter;
import com.home.output.IOutput;
import com.home.output.OutputFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        startApplication();
    }

    private static void startApplication() {
        System.out.print("Please provide csv file path: ");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();
        System.out.println("-----------------------------");
        System.out.println();
        System.out.print("Please provide file format(xml/json): ");
        String format = scanner.next();

        IFormatter iFormatter = FormatterFactory.initFormat(format);
        String result = iFormatter.format(CsvFileReader.read(fileName));

        IOutput iOutput = OutputFactory.initOutput(format,result);
        iOutput.printResult();

        System.out.println("CSV file is processed...");
        System.out.println("You can view the result in output."+format+" "+ "file");
    }
}
