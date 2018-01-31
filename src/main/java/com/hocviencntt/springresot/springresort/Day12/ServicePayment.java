package com.hocviencntt.springresot.springresort.Day12;

public class ServicePayment {
    private Visa pay1;
    private Master pay2;

    public ServicePayment(Visa pay1, Master pay2) {
        this.pay1 = pay1;
        this.pay2 = pay2;
    }

    public Visa getPay1() {
        return pay1;
    }

    public void setPay1(Visa pay1) {
        this.pay1 = pay1;
    }

    public Master getPay2() {
        return pay2;
    }

    public void setPay2(Master pay2) {
        this.pay2 = pay2;
    }
}
