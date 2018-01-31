package com.hocviencntt.springresot.springresort.Day8;

import org.springframework.beans.factory.InitializingBean;

public class CustomerVip implements InitializingBean{
    private String name;
    private String address;
    private int money;
    private boolean isVip;
    private boolean isDiscount;
    private boolean isValidPhoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public boolean isDiscount() {
        return isDiscount;
    }

    public void setDiscount(boolean discount) {
        isDiscount = discount;
    }

    public boolean isValidPhoneNumber() {
        return isValidPhoneNumber;
    }

    public void setValidPhoneNumber(boolean validPhoneNumber) {
        isValidPhoneNumber = validPhoneNumber;
    }

    @Override
    public String toString() {
        return "CustomerVip {" +
                "\nname='" + name + '\'' +
                "\naddress='" + address + '\'' +
                "\nmoney=" + money +
                "\nisVip=" + isVip +
                "\nisDiscount=" + isDiscount +
                "\nisValidPhoneNumber=" + isValidPhoneNumber +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean dang tao");
    }
}
