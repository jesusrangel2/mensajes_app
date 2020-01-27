package com.jarl;

import com.jarl.service.MessageService;

import java.util.Scanner;

public class MessagesApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int optionMenu = 0;

        do {
            System.out.println("----------------------");
            System.out.println("Aplication Messages");
            System.out.println("1. Create Message");
            System.out.println("2. List Messages");
            System.out.println("3. Delete Message");
            System.out.println("4. Update Message");
            System.out.println("5. Exit");

            //read option from user
            optionMenu = sc.nextInt();

            switch (optionMenu){
                case 1:
                    MessageService.createMessage();
                    break;
                case 2:
                    MessageService.getMessages();
                    break;
                case 3:
                    MessageService.deleteMessage();
                    break;
                case 4:
                    MessageService.updateMessage();
                    break;
                default:
                    break;
            }

        } while (optionMenu != 5);

    }


}
