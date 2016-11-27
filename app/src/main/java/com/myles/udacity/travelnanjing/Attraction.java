package com.myles.udacity.travelnanjing;

/**
 * Created by asus on 23/11/2016.
 */

public class Attraction {
    private String mName;
    private String mDesciption;
    private int mImageResourceId;

    public Attraction(String name, String desciption, int imageResourceId){
        this.mName = name;
        this.mDesciption = desciption;
        this.mImageResourceId = imageResourceId;
    }

    public void setName(String name){ this.mName = name; }

    public void setDesciption(String desciption){this.mDesciption = desciption;}

    public void setImageResourceId(int imageResourceId){ this.mImageResourceId = imageResourceId; }

    public String getName(){ return this.mName;}

    public String getDesciption(){ return this.mDesciption;}

    public int getImageResourceId(){ return this.mImageResourceId;}
}
