package day1til5;

import java.util.Scanner;

public class day2 {
    public static void  main (String[] args)
    {
        task3();
    }


    public static void task1()
    {Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();



        if (a<0) {
            System.out.println("Error");

        }
        else if (a<=4&&a>=1){
            System.out.println("LowLevel House");
        }
        else if (a>=5&&a<=8){
            System.out.println("MiddleLevel House");
        }
        else {
            System.out.println("HighLevel House");
        }

    }

    public static void task2 ()
    {   Scanner scanner2 = new Scanner(System.in);
        int b = scanner2.nextInt();
        int c = scanner2.nextInt();

        if (b>c)
        {
            System.out.println("Error, enter correct numbers");
        }
        else
        {
            int i=b+1;
            while (i<c)
            {

                if (i%5==0 && i%10!=0)
                {
                    System.out.println(i); i++;

                }
                else {i++;}


            }
            /*for (int i=b+1; i<c; i++)
            {
                if (i%5 == 0 &&i%10!=0) {
                System.out.println(i);
                }
            else
            {
            continue;
            }
            }*/

        }


    }
    public static void  task3()
    {
        Scanner scanner3 = new Scanner(System.in);
        double a = scanner3.nextDouble();
        double b;
        if (a>=5)
        {
            b=((a*a-10)/(a+7));
        }
        else if( a>-3 && a<5)
        {
            b = (a+3)*(a*a-2);
        }
        else
        {
            b=420;
        }
        System.out.println(b);
    }
}

