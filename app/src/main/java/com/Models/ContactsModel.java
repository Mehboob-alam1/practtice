package com.Models;

public class ContactsModel {

    int girlImage,whatsappIcon;
String girlName,age ,country;

    public int getGirlImage() {
        return girlImage;
    }

    public void setGirlImage(int girlImage) {
        this.girlImage = girlImage;
    }

    public int getWhatsappIcon() {
        return whatsappIcon;
    }

    public void setWhatsappIcon(int whatsappIcon) {
        this.whatsappIcon = whatsappIcon;
    }

    public String getGirlName() {
        return girlName;
    }

    public void setGirlName(String girlName) {
        this.girlName = girlName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ContactsModel(int girlImage, int whatsappIcon, String girlName, String age, String country) {
        this.girlImage = girlImage;
        this.whatsappIcon = whatsappIcon;
        this.girlName = girlName;
        this.age = age;
        this.country = country;
    }
}


