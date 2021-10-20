package day1til5;

import java.util.Scanner;

public class day3 {
    public static void  main(String[] args)
    {
        task3();
        
    }
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        String b = "Stop";

        String a = null;

        do {{
            a = scanner.nextLine();
            System.out.println(b);
            switch (a)
            {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;

                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия"); break;
                case "Stop":
                    System.out.println("EXIT");
                default:
                    System.out.println("Неизвестная страна");break;
            }
        }}
        while (!a.equals(b));

        }
    public static void task2() {
            Scanner scanner2 = new Scanner(System.in);
            double a, b;
            while (true)
            {
                a = scanner2.nextDouble();
                b = scanner2.nextDouble();
                if (b==0) {break;}
                else {System.out.println(a/b);}

            }


        }
    public static void task3() {
            Scanner scanner3 = new Scanner(System.in);
            double a, b;
               for (int i=0; i<5; i++)
                {
                    a = scanner3.nextDouble();
                    b = scanner3.nextDouble();
                    if (b==0) {
                        System.out.println("Деление на 0");
                        continue;
                    }
                    System.out.println(a/b);

                }


            }

}
