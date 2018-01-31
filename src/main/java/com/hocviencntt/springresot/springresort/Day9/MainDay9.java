package com.hocviencntt.springresot.springresort.Day9;

import com.hocviencntt.springresot.springresort.Resort.Active;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDay9 implements Active {

    @Override
    public void run() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(
                "app.xml");
        Customer customer = (Customer) context.getBean("cusDay9");
        System.out.println(customer.getInforCus());
        context.registerShutdownHook();
        Customer customer1 = (Customer) context.getBean("cusDay9");
        System.out.println(customer1.getInforCus());
    }
}
