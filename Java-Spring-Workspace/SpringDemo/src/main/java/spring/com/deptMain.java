package spring.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class deptMain {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("springbeans.xml");

        Department dept = context.getBean("dept", Department.class);

        System.out.println(dept);
    }
}