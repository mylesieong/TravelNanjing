package com.myles.udacity.travelnanjing;

/**
 * Created by asus on 23/11/2016.
 */

public class Attraction {
    private String mName;
    private String mDesciption;
    private String mAddress;
    private String mPhone;
    private String mWebsite;
    private int mThumbnailResourceId;
    private int mImageResourceId;

    public Attraction(String name, String desciption, String address, String phone, String website,
                      int thumbnailResourceId, int imageResourceId){
        this.mName = name;
        this.mDesciption = desciption;
        this.mAddress = address;
        this.mPhone = phone;
        this.mWebsite = website;
        this.mThumbnailResourceId = thumbnailResourceId;
        this.mImageResourceId = imageResourceId;
    }

    /**
     * Setters
     */
    public void setName(String name){ this.mName = name; }
    public void setDesciption(String desciption){this.mDesciption = desciption;}
    public void setAddress(String address){this.mAddress = address;}
    public void setPhone(String phone){this.mPhone = phone;}
    public void setWebsite(String website){this.mWebsite = website;}
    public void setThumbnailResourceId(int thumbnailResourceId){this.mThumbnailResourceId = thumbnailResourceId;}
    public void setImageResourceId(int imageResourceId){ this.mImageResourceId = imageResourceId; }

    /**
     * Getters
     */
    public String getName(){ return this.mName;}
    public String getDesciption(){ return this.mDesciption;}
    public String getAddress(){ return this.mAddress;}
    public String getPhone(){ return this.mPhone;}
    public String getWebsite(){ return this.mWebsite;}
    public int getThumbnailResourceId(){ return this.mThumbnailResourceId;}
    public int getImageResourceId(){ return this.mImageResourceId;}

    @Override
    public String toString(){
        return "Attraction:"+this.mName+"/"
                +this.mDesciption+"/"
                +this.mAddress+"/"
                +this.mPhone+"/"
                +this.mWebsite+"/"
                +this.mThumbnailResourceId+"/"
                +this.mImageResourceId;
    }
}
