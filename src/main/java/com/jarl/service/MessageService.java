package com.jarl.service;

import com.jarl.dao.MessageDAO;
import com.jarl.model.Message;

import java.util.Scanner;

public class MessageService {

    public static void createMessage(){
        Scanner sc = new Scanner(System.in);
        //get info from console
        System.out.println("Write your message");
        String message = sc.nextLine();
        System.out.println("Write your name");
        String autor = sc.nextLine();
        //crear message
        Message msg = new Message();
        msg.setMensaje(message);
        msg.setAutor(autor);
        //call bd to create message
        MessageDAO.addMessageDB(msg);
    }

    public static void getMessages(){

    }

    public static void deleteMessage(){

    }

    public static void updateMessage(){

    }
}
