package com.hocviencntt.springresot.springresort.Day5;

import com.hocviencntt.springresot.springresort.Resort.Active;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDay5 implements Active {

    @Override
    public void run() {
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
       Payment payment = (Payment) context.getBean("payment");
        System.out.println(payment.printOrder());
    }
}
