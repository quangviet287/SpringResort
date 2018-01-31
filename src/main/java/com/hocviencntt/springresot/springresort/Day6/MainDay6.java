package com.hocviencntt.springresot.springresort.Day6;

import com.hocviencntt.springresot.springresort.Resort.Active;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDay6 implements Active {

    @Override
    public void run() {
        ApplicationContext context = new ClassPathXmlApplicationContext("app1.xml");
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee.printEmployee());
    }
}
