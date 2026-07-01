package com.tka;

import org.springframework.stereotype.Component;

@Component
public class ExcelReport implements ReportGenerator {

    @Override
    public String generateReport() {

        return "Generating Excel Report Successfully...";

    }

}