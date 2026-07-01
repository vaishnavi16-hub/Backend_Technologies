package com.tka;
import org.springframework.stereotype.Component;

@Component
public class PDFReport implements ReportGenerator {
	 @Override
	    public String generateReport() {

	        return "Generating PDF Report Successfully...";

	    }
}
