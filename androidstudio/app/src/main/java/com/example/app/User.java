package com.example.app;

public class User {

    private String firstName;
    private String lastName;
    private String phone;
    private String password;

    public User(String firstName, String lastName, String phone, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.password = password;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getPhone(){
        return this.phone;
    }

    public String getPassword(){
        return this.password;
    }

    public void setFirstName(String name){
        this.firstName = name;
    }
    public void setLastName(String name){
        this.lastName = name;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    public void setPassword(String password){
        this.password = password;
    }



}
