package com.hocviencntt.springresot.springresort.Day10;

public class Master implements Payment {
    @Override
    public String howtopay() {
        return "You will pay with Master Card";
    }
}
