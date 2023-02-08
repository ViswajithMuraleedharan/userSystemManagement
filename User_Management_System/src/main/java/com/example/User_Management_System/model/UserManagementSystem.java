package com.example.User_Management_System.model;

public class UserManagementSystem {


    private int UserId;
    private String Name;
    private String UserName;
    private String Address;
    private long PhoneNumber;


    public UserManagementSystem(int userId, String name, String userName, String address, long phoneNumber) {
        UserId = userId;
        Name = name;
        UserName = userName;
        Address = address;
        PhoneNumber = phoneNumber;
    }

    public UserManagementSystem() {
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "UserManagementSystem{" +
                "UserId=" + UserId +
                ", Name='" + Name + '\'' +
                ", UserName='" + UserName + '\'' +
                ", Address='" + Address + '\'' +
                ", PhoneNumber=" + PhoneNumber +
                '}';
    }
}
