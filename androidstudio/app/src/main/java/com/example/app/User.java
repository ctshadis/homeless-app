package com.example.app;


public class User {

    private String name;
    private String phone;
    private String email;
    private String password;
    private String type;
    private String[] needs;
    private String[] offers;

    public User(String name, String phone, String type, String email, String password){
        this.name = name;
        this.phone = phone;
        this.type = type;
        this.email = email;
        this.password = password;
        this.needs = new String[5];
        this.offers = new String[5];
    }

    public String getName(){
        return this.name;
    }
    public String getPhone(){
        return this.phone;
    }


    public void setName(String name){
        this.name = name;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

}
