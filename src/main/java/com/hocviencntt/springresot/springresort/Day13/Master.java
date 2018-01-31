package com.hocviencntt.springresot.springresort.Day13;

public class Master implements Payment {
    @Override
    public String howtopay() {
        return "You will pay with Master Card";
    }
}
