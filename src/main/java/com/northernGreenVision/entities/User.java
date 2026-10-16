package com.northernGreenVision.entities;

public class User {
    public int id;
    public String email;
    public String password;
    public String firstName;
    public String lastName;
    public String phoneNumber;

    public String returnUserInformation(int id){
        return firstName + " " + lastName + " " + email + " " + phoneNumber + " " + id;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
