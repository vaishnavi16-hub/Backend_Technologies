package com.tka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfigClass.class);

        ReportService service = context.getBean(ReportService.class);

        System.out.println(service.getReportGenerator().generateReport());

    }

}