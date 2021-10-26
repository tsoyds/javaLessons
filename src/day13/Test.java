package day13;

public class Test {
    public static void main (String[] args){
        User user1 = new User ("Johhny");
        User user2 = new User ("Bill");
        User user3 = new User ("Tod");


        user1.sendMessage(user2, "Hello my dear friend");
        user1.sendMessage(user2, "How are you?");

        user2.sendMessage(user1, "Hi, Johhny");
        user2.sendMessage(user1, "I'm Ok. and you?");
        user2.sendMessage(user1, "Is Lora ok?");

        user3.sendMessage(user1, "Hey Johhny, nice to meet you here");
        user3.sendMessage(user1, "Sorry for interruption");
        user3.sendMessage(user1, "But where have you been??? I'm really scaried about you");

        user1.sendMessage(user3, "Hi, Tod");
        user1.sendMessage(user3, "I'm glad to see you too, yeah i'm ok");
        user1.sendMessage(user3, "Sorry, this is Bill, my old friend from school");

        user3.sendMessage(user1, "Oh, such a good meet");

        for (int i=0; i<MessageDatabase.messages.size(); i++) {

            System.out.println(MessageDatabase.messages.get(i));
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(user1.subscriptions);
        System.out.println(user3.subscriptions);
        System.out.println(user2.subscriptions);
        user2.subscribe(user1);
        user3.subscribe(user2);
        user1.getSubscriptions();
        System.out.println(user1.subscriptions);
        System.out.println(user3.subscriptions);
        System.out.println(user2.subscriptions);


        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        MessageDatabase.showDialog(user1, user3);


    }
}
