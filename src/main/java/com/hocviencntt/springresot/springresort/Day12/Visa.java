package com.hocviencntt.springresot.springresort.Day12;

public class Visa implements Payment {
    @Override
    public String howtopay() {
        return "You will pay with Visa Card";
    }
}
