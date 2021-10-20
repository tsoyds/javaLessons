package day1til5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class day4 {
    public static void main(String[] args) {
        task4();
    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(array.length);
            System.out.println(array[i]);
        }

        // System.out.println("Length of " + array.length);
        int b = 0, c = 0, d = 0, e = 0, sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8)
                b++;
            else if (array[i] == 1) c++;
            else if (array[i] % 2 == 0) d++;
            else if (array[i] % 2 != 0) e++;
            sum = sum + array[i];
        }
        System.out.println("Length of massive " + array.length);
        System.out.println("Count of numbers more than 8 is " + b);
        System.out.println("Count of numbers equals 1 " + c);
        System.out.println("Count of even numbers " + d);
        System.out.println("Count of odd numbers " + e);
        System.out.println("Summary is " + sum);

    }

    public static void task2() {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        System.out.println(Arrays.stream(array).max());
        System.out.println(Arrays.stream(array).min());
        int sum = 0;
        int number0 = 0;
        for (int i : array) {
            if (i % 10 == 0) {
                number0++;
                sum = i + sum;
            }


        }
        System.out.println(number0);
        System.out.println(sum);


    }

    public static void task3() {
        Random random3 = new Random();

        int sumNumber = 0;
        int[][] array3 = new int[12][8];
        int[] sum = new int[array3.length];
        //for (int i: for( int j: array3[i]))
        for (int i = 0; i < array3.length; i++) {
            sumNumber = 0;
            for (int j = 0; j < array3[i].length; j++) {
                array3[i][j] = random3.nextInt(50);
                sumNumber = sumNumber + array3[i][j];
                System.out.print(" " + array3[i][j]);
            }
            System.out.println();
            sum[i] = sumNumber;
            System.out.println(sum[i]);
        }
        int test = 0;
        int test2 = 0;
        for (int i = 0; i < sum.length; i++) {
            if (test < sum[i]) {
                test = sum[i];
                test2 = i;
            }
        }
            System.out.println(Arrays.stream(sum).max());
            System.out.println("MAX SUM  " + test2);

        }

    public static void task4() {
        int [] array4 = new int[10];
        Random random = new Random();
        for (int i=0; i<array4.length; i++) {
            array4[i] = random.nextInt(10000);
        }
        //int sumTest=0;
        int [] sum = new int [array4.length-2];
        for (int i=0; i<array4.length-2; i++)

        {
              sum[i] = array4[i]+array4[i+1]+array4[i+2];
            System.out.println(array4[i]);
        }
        //System.out.println(Arrays.stream(sum).max());
        int test = 0;
        int test2 = 0;
        for (int i = 0; i < sum.length; i++) {
            if (test < sum[i]) {
                test = sum[i];
                test2 = i;
            }
        }
        System.out.println(Arrays.stream(sum).max());
        System.out.println("index of max sum is: " + test2);
    }

    }

