package com.hocviencntt.springresot.springresort.Day8;

public class SpelOperators {
    private int money;
    private boolean isVip;
    private boolean isDiscount;

    public SpelOperators() {
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }

    public boolean isDiscount() {
        return isDiscount;
    }

    public void setDiscount(boolean discount) {
        isDiscount = discount;
    }

    @Override
    public String toString() {
        return "SpelOperators{" +
                "money=" + money +
                ", isVip=" + isVip +
                ", isDiscount=" + isDiscount +
                '}';
    }
}
