package com.myles.udacity.travelnanjing;

/**
 * Created by asus on 23/11/2016.
 */

public class Attraction {
    String mName;
    String mAddress;

    public Attraction(String name, String address){
        this.mAddress = address;
        this.mName = name;
    }

    public void setName(String name){
        this.mName = name;
    }

    public void setAddress(String address){
        this.mAddress = address;
    }

    public String getName(){
        return this.mName;
    }

    public String getAddress(){
        return this.mAddress;
    }
}
