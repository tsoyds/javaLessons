package day16;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("file1.txt");
        //FileOutputStream writer = new FileOutputStream("file1.txt");
        FileWriter writer = new FileWriter("file1.txt");
        for (int i=0; i<1000; i++){
            writer.write(String.valueOf((int)(Math.random()*100)));
            writer.write(" ");
        }
        writer.close();

        File file2 = new File("file2.txt");
        PrintWriter pw = new PrintWriter("file2.txt");
        Scanner scanner = new Scanner(file1);
        while(scanner.hasNextInt()){
            double sum=0;
            for (int i=0; i<20; i++) {
                sum+=scanner.nextInt();
            }
            sum=(double)sum/20;
            pw.print(sum);
            //pw.write(String.valueOf(sum));
            pw.write(" ");
        }
        scanner.close();
        pw.close();

        printResult(file2);
    }
    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        double sum=0;
        while(scanner.hasNext()){
            sum+=Double.valueOf(scanner.next());;
            System.out.println("Hello from while cycle");
            System.out.println(sum);
        }
        System.out.println((int)sum);
        scanner.close();
    }
}
