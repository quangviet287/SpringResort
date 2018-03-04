package com.hocviencntt.springresot.springresort.Day13;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
    private String name;
    private int age;
    private String sex;
    private String idCus;
    private int pay;

    @Autowired(required = false)
    private Master master;

    @Autowired(required = false)
    private Visa visa;

    public void setInforCus(String name, int age, String sex, String idCus, int pay){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.idCus = idCus;
        this.pay = pay;
    }
    public String getInforCus(){
        String infor = "Name: "+getName()+ " Age: "+getAge()+" Sex: "+getSex()+" Id Code: "+ getIdCus();
        return infor;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdCus() {
        return idCus;
    }

    public void setIdCus(String idCus) {
        this.idCus = idCus;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public void getPayment(){
        if(pay == 1){
            System.out.println(master.howtopay());
        }else if(pay == 2)
            System.out.println(visa.howtopay());
    }
}
