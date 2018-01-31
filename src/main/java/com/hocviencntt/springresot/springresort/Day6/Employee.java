package com.hocviencntt.springresot.springresort.Day6;

public class Employee {
    private String name;
    SwimmingPool swimmingPool;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SwimmingPool getSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(SwimmingPool swimmingPool) {
        this.swimmingPool = swimmingPool;
    }
    public String printEmployee(){
        String result = "Name: "+getName()+"\nManage SwimmingPool: " + swimmingPool.getName()+" .Open Time: " + swimmingPool.getTimeOn();
        return result;
    }
}
