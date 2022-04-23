package com.learning.java;
import java.util.Locale;
import java.util.Scanner;

public class Java_Homework_3 {
    public static void main(String[] args) {
        Scanner OBJECT = new Scanner(System.in);

        System.out.println("Which Part Of Homework (1 to 7) :");
        String choice = OBJECT.nextLine();

        if (choice.equals("1")) {
            System.out.println("What month should I print (1 to 12) : ");
            String Month = OBJECT.nextLine();
            switch (Month){
                case "1":
                    System.out.println("First Month is JANUARY");
                    break;
                case "2":
                    System.out.println("Second Month is FEBRUARY");
                    break;
                case "3":
                    System.out.println("Third Month is MARCH");
                    break;
                case "4":
                    System.out.println("Forth Month is APRIl");
                    break;
                case "5":
                    System.out.println("Fifth Month is MAY");
                    break;
                case "6":
                    System.out.println("Sixth Month is JUNE");
                    break;
                case "7":
                    System.out.println("Seventh Month is JULY");
                    break;
                case "8":
                    System.out.println("Eighth Month is AUGUST");
                    break;
                case "9":
                    System.out.println("Ninth Month is SEPTEMBER");
                    break;
                case "10":
                    System.out.println("Tenth Month is OCTOBER");
                    break;
                case "11":
                    System.out.println("Eleventh Month is NOVEMBER");
                    break;
                case "12":
                    System.out.println("Twelfth Month is DECEMBER");
                    break;
            }
        }

        else if (choice.equals("2")) {
            System.out.println("EVEN NUMBERS :");
            for (int i = 0; i < 20; i += 2) {
                System.out.println(i);
            }
            System.out.println("ODD NUMBERS :");
            for (int i = 1; i < 21; i += 2) {
                System.out.println(i);
            }
        }

        else if (choice.equals("3")) {
            System.out.println("10 TIMES TABLE :");
            for (int i = 1; i <= 10; i ++) {
                System.out.println("10 * "+i+ " = "+(10*i));
            }
        }
        else if (choice.equals("4")) {
            int i = 0;
            while (i <= 20) {
                if (i % 2 == 0){
                    System.out.println(i + " Is Even");
                }
                else if (i % 2 == 1) {
                    System.out.println(i + " Is Odd");
                }
                i++;
            }
        }

        else if (choice.equals("5")) {
            int i = 1;
            while (i <= 10) {
                System.out.println("9 * "+i+ " = "+(9*i));
                i++;
            }
        }

        else if (choice.equals("6")) {
            int i = 0;
            do {
                if (i % 2 == 0){
                    System.out.println(i + " Is Even");
                }
                else if (i % 2 == 1) {
                    System.out.println(i + " Is Odd");
                }
                i++;
            }
            while (i <= 20);
        }

        else if (choice.equals("7")) {
            System.out.println("What Number do you want the time table of : ");
            int Number = OBJECT.nextInt();
            int i = 1;
            do {
                System.out.println(Number + " * "+i+ " = "+(Number*i));
                i++;
            }
            while (i <= 10);
        }

        else {
            System.out.println("INVALID INPUT");
        }
    }
}
