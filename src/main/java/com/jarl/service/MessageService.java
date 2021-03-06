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
        MessageDAO.getMessagesDB();
    }

    public static void deleteMessage(){
        Scanner sc = new Scanner(System.in);
        //get info from console
        System.out.println("Id message to delete");
        Integer id_message = sc.nextInt();
        MessageDAO.deleteMessageDB(id_message);
    }

    public static void updateMessage(){
        Scanner sc = new Scanner(System.in);
        //get info from console
        System.out.println("Write new message");
        String message = sc.nextLine();
        System.out.println("Write id message you want edit");
        Integer id_message = sc.nextInt();
        //crear message
        Message msg = new Message();
        msg.setMensaje(message);
        msg.setId(id_message);
        //call bd to update message
        MessageDAO.updateMessageDB(msg);

    }
}
