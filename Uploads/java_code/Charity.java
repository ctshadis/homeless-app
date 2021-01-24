package com.example.app;

public class Charity {

    private String charityName;
    private String charityPhone;
    private String charityAddress;
    private String charityDescription;

    public Charity(String name, String phone, String addy, String desc){
        charityName = name;
        charityPhone = phone;
        charityAddress = addy;
        charityDescription = desc;
    }

    public String getCharityName(){return charityName;}
    public String getCharityPhone(){return charityPhone;}
    public String getCharityAddress(){return charityAddress;}
    public String getCharityDescription(){return charityDescription;}


}
