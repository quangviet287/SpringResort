package com.hocviencntt.springresot.springresort.Day9;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Customer implements InitializingBean,DisposableBean {
    private String name;
    private int age;
    private String sex;
    private String idCus;

    public void setInforCus(String name, int age, String sex, String idCus){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.idCus = idCus;
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

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean dang duoc huy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean dang duoc tao");
    }
}
