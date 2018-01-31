package com.hocviencntt.springresot.springresort.Day1;

import com.hocviencntt.springresot.springresort.Resort.Active;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDay1 implements Active {
    @Override
    public void run() {
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("hello");
        System.out.println(helloWorld.getMessage());
    }

}
