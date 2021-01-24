package com.example.app;

public class Shelter {

    private String id;
    private String name;
    private String tel;
    private int streetAddress;
    private String streetName;

    public Shelter(String id, String name, String tel, int streetAddress, String streetName){
        this.id = id;
        this.name = name;
        this.streetAddress = streetAddress;
        this.streetName = streetName;
        this.tel = tel;
    }

    public String getName(){
        return this.name;
    }

    public String getTel(){
        return this.tel;
    }

    public String getStreetName(){
        return this.streetName;
    }

    public int getStreetAddress(){
        return this.streetAddress;
    }

    public String getID() { return this.id; }
}
