package com.hocviencntt.springresot.springresort.Day8;

import com.hocviencntt.springresot.springresort.Resort.Active;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDay8 implements Active {

    @Override
    public void run() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("SpEL.xml");
        CustomerVip customerVip = (CustomerVip) context.getBean("cusVip");
        System.out.println(customerVip.toString());
        context.registerShutdownHook();
    }
}
