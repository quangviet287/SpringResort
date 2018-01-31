package com.hocviencntt.springresot.springresort.Day13;

import com.hocviencntt.springresot.springresort.Resort.Active;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDay13 implements Active {
    @Override
    public void run() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("app.xml");
        BeanFactory beanFactory = (BeanFactory) applicationContext;
        ServicePayment servicePayment = (ServicePayment) beanFactory.getBean("servicePaymentD13");
        System.out.println("Payment 1: "+ servicePayment.getPayment_1().howtopay());
        System.out.println("Payment 2: "+ servicePayment.getPayment_2().howtopay());
    }
}
