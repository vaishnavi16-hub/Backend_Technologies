package com.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfigClass;
import com.config.Department;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfigClass.class);
		Department d = context.getBean("dept", Department.class);
		System.out.println(d);

//		Department d1 = context.getBean(Department.class);
//		System.out.println(d1);

//		System.out.println(d.hashCode());
//		System.out.println(d1.hashCode());
//		System.out.println(d == d1);

	}
}
