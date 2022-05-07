package com.learning.java;

import java.util.Scanner;

public class Java_Homework_4_Simple {
    void Triangle(){
        Scanner OBJ = new Scanner(System.in);

        System.out.println("What pattern do you want to see? (1,2 or 3)");
        System.out.println("Right Triangle  Star Pattern (1)");
        System.out.println("Pyramid Program (2)");
        System.out.println("Left Triangle Star Pattern (3)");
        int choice = OBJ.nextInt();


        if (choice == 1){
            System.out.println("*");
            System.out.println("* *");
            System.out.println("* * *");
            System.out.println("* * * *");
            System.out.println("* * * * *");
        }
        else if (choice==2){
            System.out.println("    *   ");
            System.out.println("   * *   ");
            System.out.println("  * * * ");
            System.out.println(" * * * * ");
            System.out.println("* * * * *");
        }
        else if (choice ==3) {
            System.out.println("    *");
            System.out.println("   * *");
            System.out.println("  * * *");
            System.out.println(" * * * *");
            System.out.println("* * * * *");
        }
    }
    public static void main(String[] args) {
        Java_Homework_4_Complicated Object = new Java_Homework_4_Complicated();
        Object.Triangle();
    }
}
