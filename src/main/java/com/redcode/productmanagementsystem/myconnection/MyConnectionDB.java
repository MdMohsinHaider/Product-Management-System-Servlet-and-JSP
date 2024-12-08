package com.redcode.productmanagementsystem.myconnection;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnectionDB {
    public static Connection getConnection(){
        try {
            DriverManager.registerDriver(new Driver());
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/DB NAME"," ","");
        } catch (SQLException e) {
            System.err.println("Connection : "+e.getMessage());
            return null;
        }
    }
}
