package com.ticketbooking.app;

public class User {
    String name;
    String phno;
    String email;
    String address;
    String user_name;
    String password;

    public User(String name, String phno, String email, String address, String user_name, String password) {
        this.name = name;
        this.phno = phno;
        this.email = email;
        this.address = address;
        this.user_name = user_name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPhno() {
        return phno;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getPassword() {
        return password;
    }
}
