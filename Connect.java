package com.dataconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

    public static Connection DataConnect() throws ClassNotFoundException {
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/GLSDB", "root", "Ganesha@123");
            System.out.println("Connected");
        } catch (SQLException e) {
            // Handle the exception if connection fails
            e.printStackTrace();
        }

        return con;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Connection connection = DataConnect();

        // Check if the connection is not null before using it
        if (connection != null) {
            // Connection is not null, you can use it
            // Your code here
        	DataConnect();
           
        } else {
            // Connection is null, handle the case where the connection failed
            System.out.println("Connection is null. Failed to connect.");
        }
    }
}
