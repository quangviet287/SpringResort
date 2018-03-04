package com.hocviencntt.springresot.springresort.Day15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentImpl {

    @Autowired
    private Visa visa;

    @Autowired
    private Master master;

    public void getPayment(){
        System.out.println(visa.howtopay());
        System.out.println(master.howtopay());
    }
}
