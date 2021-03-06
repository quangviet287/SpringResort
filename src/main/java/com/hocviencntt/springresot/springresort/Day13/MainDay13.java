package com.hocviencntt.springresot.springresort.Day13;

import com.hocviencntt.springresot.springresort.Resort.Active;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDay13 implements Active {
    @Override
    public void run() {
        ApplicationContext context = new ClassPathXmlApplicationContext("appAno.xml");
        Customer customer = (Customer) context.getBean("cus");
        customer.getPayment();
    }
}
