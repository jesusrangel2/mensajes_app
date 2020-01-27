package com.jarl.dao;

import com.jarl.ConectorBD;
import com.jarl.model.Message;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MessageDAO {

    public static void addMessageDB(Message message){
        ConectorBD db = new ConectorBD();
        try{
            Connection dbCon = db.getConnection();
            PreparedStatement ps = null;
            try{
                String query = "INSERT INTO mensajes (mensaje, autor) VALUES (?, ?)";
                ps = dbCon.prepareStatement(query);
                ps.setString(1, message.getMensaje());
                ps.setString(2, message.getAutor());
                ps.executeUpdate();
                System.out.println("Add message OK");
            } catch (SQLException e) {
                System.out.println("Add message FAIL");
                e.printStackTrace();
            }
            dbCon.close();
        }catch (Exception e){
            System.out.println("Could not get de bd conection");
        }

    }

    public static void getMessagesDB(){
        ConectorBD db = new ConectorBD();
        try{
            Connection dbCon = db.getConnection();
            PreparedStatement ps = null;
            ResultSet rs = null;
            try{
                String query = "SELECT * FROM mensajes";
                ps = dbCon.prepareStatement(query);
                rs = ps.executeQuery();
                while (rs.next()){
                    System.out.println("ID: " + rs.getInt("id_mensaje"));
                    System.out.println("Autor: " + rs.getString("autor"));
                    System.out.println("Message: " + rs.getString("mensaje"));
                    System.out.println("Published at: " + rs.getString("date_publication"));
                    System.out.println("");
                }

                dbCon.close();
            } catch (SQLException e) {
                System.out.println("Cant list the message");
                e.printStackTrace();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void deleteMessageDB(int id){

    }

    public static void updateMessageDB(Message message){

    }

}

