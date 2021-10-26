package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username; // имя пользователя

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", subscriptions=" + subscriptions +
                '}';
    }

    List<User> subscriptions; // лист подписок

    public User (String username){ // конструктор, принимающий на вход строковое имя пользователя
        this.username=username;
        this.subscriptions = new ArrayList(); // инициализация пустого листа подписок
    }

    public void subscribe (User user){ // метод подписки - добавляет user в лист подписок
        this.subscriptions.add(user);
    }

    public boolean isSubscribed (User user){ // проверяет подписан ли user
        for(User currentUser: subscriptions){
            if (currentUser.getUsername().equals(user.getUsername())) return true;
        }
        return false;
    }

    public boolean isFriend (User user){
        return this.isSubscribed(user)&&user.isSubscribed(this);
        // проверка дружбы - взаимная подписка
    }

    public void sendMessage (User user, String text){ // Отправка сообщений берем метод из MessageDatabase
        MessageDatabase.sendMessage(User.this, user, text);
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

}
