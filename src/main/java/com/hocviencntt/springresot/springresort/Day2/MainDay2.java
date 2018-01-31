package com.hocviencntt.springresot.springresort.Day2;

import com.hocviencntt.springresot.springresort.Resort.Active;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDay2 implements Active{
    @Override
    public void run() {
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        Customer cus1 = (Customer) context.getBean("cus1");
        System.out.println(cus1.getInforCus());
    }
}
