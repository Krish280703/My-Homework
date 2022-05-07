package com.learning.java;
import java.util.Scanner;

public class Java_Homework_4_Complicated {
    void Triangle(){
        Scanner OBJ = new Scanner(System.in);

        System.out.println("What pattern do you want to see? (1,2 or 3)");
        System.out.println("Right Triangle  Star Pattern (1)");
        System.out.println("Pyramid Program (2)");
        System.out.println("Left Triangle Star Pattern (3)");
        int choice = OBJ.nextInt();


        if (choice == 1){
            for (int x = 0; x < 5; x++) {
                for (int y = 0; y <= x; ++y) {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
        }

        else if (choice==2){
            for (int i=0; i<5; i++)
            {
                for (int j=5-i; j>1; j--)
                {
                    System.out.print(" ");
                }
                for (int j=0; j<=i; j++ )
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        else if (choice ==3) {

            for (int x = 0; x < 5; x++) {
                for (int y = 2 * (5 - x); y >= 0; y--) {
                    System.out.print(" ");
                }
                for (int y = 0; y <= x; y++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Java_Homework_4_Complicated Object = new Java_Homework_4_Complicated();
        Object.Triangle();
    }
}
