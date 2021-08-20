package com.Models;

public class ProfileModel {
   String countryName;
   String age;
    String contactNo;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public ProfileModel(String countryName, String age, String contactNo) {
        this.countryName = countryName;
        this.age = age;
        this.contactNo = contactNo;
    }
}


