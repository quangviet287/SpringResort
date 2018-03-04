package com.hocviencntt.springresot.springresort.Day15;

import org.springframework.stereotype.Repository;

@Repository
public class Master implements Payment {
    @Override
    public String howtopay() {
        return "You will pay with Master Card";
    }
}
