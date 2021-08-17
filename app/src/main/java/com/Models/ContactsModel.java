package com.Models;

public class ContactsModel {
    int girlImage,whatsappIcon;

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

    public ContactsModel(int girlImage, int whatsappIcon) {
        this.girlImage = girlImage;
        this.whatsappIcon = whatsappIcon;
    }
}
