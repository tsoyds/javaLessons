package day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("text.txt");
        printResult(file);

    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int i = 0;
        int sum = 0;
        while(scanner.hasNext()){
            sum+=scanner.nextInt();
            i++;
        }
        double k = (double)sum/i;

        System.out.println(k);
        System.out.println("with 3 symbols");
        System.out.printf("%.3f", k);


    }
}
