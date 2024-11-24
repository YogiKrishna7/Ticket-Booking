package com.ticketbooking.app;

import java.sql.*;

public class Connect {
    static Connection getConnected() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/ticket_booking";
        String username = "root";
        String password = "yogi";

        return DriverManager.getConnection(url, username, password);
    }
}
