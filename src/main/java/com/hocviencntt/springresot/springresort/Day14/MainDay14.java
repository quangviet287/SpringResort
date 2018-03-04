package com.hocviencntt.springresot.springresort.Day14;

import com.hocviencntt.springresot.springresort.Resort.Active;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDay14 implements Active {
    @Override
    public void run() {
        ApplicationContext context = new ClassPathXmlApplicationContext("appAno.xml");
        Customer customer = (Customer) context.getBean("cus1");
        System.out.println(customer.getInforCus());
    }
}
