package com.hocviencntt.springresot.springresort.Day5;

public class Payment {
    private Order order;

    public Payment(Order order) {
        this.order = order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    public String printOrder(){
        String result = "Number of days: " + order.getDates()+"\nPrice: "+order.getPrice()+"\nDate out: " + order.getDates();
        return result;
    }
}
