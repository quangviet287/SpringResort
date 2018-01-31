package com.hocviencntt.springresot.springresort.Day3;

import com.hocviencntt.springresot.springresort.Resort.Active;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDay3 implements Active {

    @Override
    public void run() {
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        Customer customer = (Customer) context.getBean("cus2");
        System.out.println(customer.getInforCus());
    }
}
