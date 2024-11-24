package com.ticketbooking.app;

import java.sql.*;
import java.util.*;

public class Ticket_Booking_Main {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            Connection c = Connect.getConnected();

            Ticket_Booking_DAO dao = new Ticket_Booking_DAO(c);

            // System.out.println("Enter name: ");
            // String name = input.nextLine();
            // System.out.println("Enter Phone Number: ");
            // String phoneNumber = input.nextLine();
            // System.out.println("Enter Email: ");
            // String email = input.nextLine();
            // System.out.println("Enter Address: ");
            // String address = input.nextLine();
            // System.out.println("Create a username: ");
            // String userName = input.nextLine();
            // System.out.println("Create Password: ");
            // String password = input.nextLine();

            // User ob = new User(name, phoneNumber, email, address, userName, password);

            // dao.userRegister(ob);

            dao.authenticate();

            // dao.changePassword();

            // dao.resetPassword();

            dao.selectShowtime();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
