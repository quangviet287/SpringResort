package com.hocviencntt.springresot.springresort.Day3;

public class Address {
    private String number;
    private String street;
    private String city;
    private String country;

    public Address(String number, String street, String city, String country) {
        this.number = number;
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public String printCustomerAdress(){
        String address=getNumber()+", "+getStreet()+", "+getCity()+", "+getCountry();
        return address;
    }
}
