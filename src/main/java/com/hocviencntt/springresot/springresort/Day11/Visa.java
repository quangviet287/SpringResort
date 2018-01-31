package com.hocviencntt.springresot.springresort.Day11;

public class Visa implements Payment {
    @Override
    public String howtopay() {
        return "You will pay with Visa Card";
    }
}
