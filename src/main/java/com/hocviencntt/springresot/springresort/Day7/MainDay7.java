package com.hocviencntt.springresot.springresort.Day7;

import com.hocviencntt.springresot.springresort.Resort.Active;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDay7 implements Active {
    @Override
    public void run() {
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        Customer customer = (Customer) context.getBean("cus7");
        customer.getInforListCus();
    }
}
