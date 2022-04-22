package com.learning.java;
import java.util.Scanner;

public class Java_Homework_2 {
    public static void main(String[] args) {
        Scanner OBJECT = new Scanner(System.in);

        System.out.println("Which Part Of Homework (1 to 6 Excluding 5) :");
        String choice = OBJECT.nextLine();

        if (choice.equals("1")) {
            System.out.println("What is your age");
            int Age = OBJECT.nextInt();
            if (Age >= 18) {
                System.out.println("You are old enough to vote :)");
            }
            else {
                System.out.println("You are too young and can't vote :(");
            }
        }

        else if (choice.equals("2")) {
            System.out.println("Tell me a number");
            int Number = OBJECT.nextInt();
            if (Number >= 0 ) {
                System.out.println("Number is Positive");
            }
            else {
                System.out.println("Number is Negative");
            }
        }

        else if (choice.equals("3")) {
            System.out.println("Tell me a number");
            int Number = OBJECT.nextInt();
            if (Number > 0 ) {
                System.out.println("Number is Positive");
            }
            else if (Number == 0) {
                System.out.println("Number is Zero");
            }
            else {
                System.out.println("Number is Negative");
            }
        }

        else if (choice.equals("4")) {
            System.out.println("Tell me a number");
            int Number = OBJECT.nextInt();
            if ((Number & 2) == 0 ) {
                System.out.println("Number is even");
            }
            else {
                System.out.println("Number is odd");
            }
        }

        else if (choice.equals("6")) {
            System.out.println("Tell me a number");
            float Number = OBJECT.nextFloat();

            System.out.println(Number + " Times by " + "2 = " + (Number * 2));
            System.out.println(Number + " Add " + "5 = " + (Number + 5));
            System.out.println(Number + " Subtract " + "2 = " + (Number - 2));
            System.out.println(Number + " Divide " + "2 = " + (Number / 2));
            Number++;
            System.out.println("The Next number would be: " + (Number));
            Number--;
            Number--;
            System.out.println("The Previous number would be: " + (Number));
        }

        else {
            System.out.println("INVALID INPUT");
        }
    }
}
