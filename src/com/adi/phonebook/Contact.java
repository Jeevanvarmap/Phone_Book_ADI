package com.adi.phonebook;

class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setName(String inputName) {
        this.name=inputName;
    }

    public void setPhoneNumber(String inputPhoneNumber) {
        this.phoneNumber=inputPhoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phoneNumber;
    }
}