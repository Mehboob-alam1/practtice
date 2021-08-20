package com.Models;

public class Country_model {
    int country_pic, whatsapp_pic;
    String text;

    public int getCountry_pic() {
        return country_pic;
    }

    public void setCountry_pic(int country_pic) {
        this.country_pic = country_pic;
    }

    public int getWhatsapp_pic() {
        return whatsapp_pic;
    }

    public void setWhatsapp_pic(int whatsapp_pic) {
        this.whatsapp_pic = whatsapp_pic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Country_model(int country_pic, int whatsapp_pic, String text) {
        this.country_pic = country_pic;
        this.whatsapp_pic = whatsapp_pic;
        this.text = text;
    }
}
