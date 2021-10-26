package day13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MessageDatabase {
    static List<Message> messages = new ArrayList<>();

    public static void sendMessage (User u1, User u2, String text){
        Message message = new Message(u1,u2,text);
        messages.add(message); //add to message to database
    }

    public static List<Message> getMessages(int i){
        return messages; //check this moment later
    }

    public static void showDialog (User u1, User u2){
       for(Message message: messages){
           if (message.getSender()==u1 && message.getReceiver()==u2
               || message.getSender() == u2 && message.getReceiver() == u1){
               System.out.println(message.getSender()+":" +message.getText());
           }
       }

        }



}
