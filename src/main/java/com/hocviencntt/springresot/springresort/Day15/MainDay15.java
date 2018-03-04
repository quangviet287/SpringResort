package com.hocviencntt.springresot.springresort.Day15;

import com.hocviencntt.springresot.springresort.Resort.Active;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDay15 implements Active {
    @Override
    public void run() {
        ApplicationContext context = new ClassPathXmlApplicationContext("appD15.xml");
        PaymentImpl payment = (PaymentImpl) context.getBean("payiml");
        payment.getPayment();
    }
}
