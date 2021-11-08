package SeaFight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Player {
    String name;
    public Player(String name){
        this.name = name;
    }
    // Два  игрока, играющие в морской бой. Характеристики, присущие игрокам - имя, остальное непонятно
    // у игроков могут быть методы в процессе самой игры.
    public void shot (ShipField field){
        System.out.println("Введите координаты (формат x,y)");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine(); // ввод с клавиатуры координат корабля для потопления
        String[] str = s.split(",");
        int i = Integer.valueOf(str[0]);
        int j = Integer.valueOf(str[1]);
        System.out.println(i + " AND "+ j);
        //switch (field[i][j])
        //case "\uD83C\uDF0A": System.out.println("Мимо!");
         //   break;

        System.out.println("Попадание!");
        System.out.println("Утопил");
    }

}
