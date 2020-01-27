package com.jarl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectorBD {

    public Connection getConnection(){
        Connection dbConection = null;
        try {
            dbConection = DriverManager.getConnection("jdbc:mysql://localhost:33060/mensajes_app", "root", "secret");
            if(dbConection != null){
                System.out.println("conexon established");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dbConection;
    }

}
