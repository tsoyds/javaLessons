package day15;
/*
Вам дан файл с информацией об остатках обуви на складе
(src/main/resources/shoes.csv) . Это пример реальной выгрузки остатков из 1С
в csv файл (формат файла с разделителями, в качестве разделителя использован
символ “;”). В этом файле содержится информация о названии модели обуви, ее
размер и оставшееся на складе количество.
До преобразования в csv это была таблица с тремя колонками:
Название Размер Кол-во
Ботинки HS РАН-Р 400 чер. ЗП 45 4
Ботинки PANDA САНИТАРИ 3916 S1 SRC бел. 37 1
...
Необходимо сформировать новый файл
(src/main/resources/missing_shoes.txt) с информацией о моделях и
размерах обуви, которой нет на складе (количество = 0) . Для этого реализуйте
программу, которая принимает на вход csv файл и создает новый txt файл
следующего содержания (должно получиться 11 строк):
Ботинки СВАРЩИК ут М.1398 ЗП, 40, 0
Ботинки СВАРЩИК ут М.1398 ЗП, 45, 0
Ботинки
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main (String[] args) throws FileNotFoundException {
        File shoes = new File ("shoes.csv");
        getDataFromFile missingShoes = new getDataFromFile(shoes);

        File file = new File("missing_shoes.txt");

        PrintWriter pw = new PrintWriter(file);
        for (int i=0; i<missingShoes.shoesFromFile.size();i++){
            pw.println(missingShoes.shoesFromFile.get(i).toString());
        }


        pw.close();
    }

}
class getDataFromFile {
    List<shoes> shoesFromFile = new ArrayList(); // создаем внутреннюю коллекцию для работы с входящим файлом
    File file; //инициализация файла
    public getDataFromFile (File file) throws FileNotFoundException { //Обработка исключения не нахождения файла
        // конструктор принимающий на вход файл и выполняющий задачу
        this.file = file;

        Scanner dataFromFile= new Scanner(this.file); // метод сканнер, считывание данных из файла

            while (dataFromFile.hasNextLine()){ // цикл выполняется пока есть следующая линия в файле
                String str = dataFromFile.nextLine(); // запись строки в переменную str
                String[] newArrStr = new String[str.split(";").length];//создаем массив строк
                // из полученной строки, где разделитель ;
                newArrStr =  str.split(";");

                str = newArrStr[0];
                int i = Integer.valueOf(newArrStr[1]);
                int j = Integer.valueOf(newArrStr[2]);

                if (j==0){
                    shoesFromFile.add(new shoes(str, i, j)); //добавляем в коллекцию обувь с параметрами
                }
            }
        }
}
