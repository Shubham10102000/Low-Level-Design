package com.lld.creational.objectPool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    Connection mySqlConnection;
    DBConnection() {
        try {
            mySqlConnection = DriverManager.getConnection("url","username","password");
        } catch (Exception e) {
            // handle exception here
        }
    }
}
