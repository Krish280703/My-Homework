package com.learning.java;
import java.util.Scanner;

public class Light_Using_Objects {
    String on;
    void Turn_Light_On(){
        on = "on";
        System.out.println("The light is "+on);
    }
    void Turn_Light_Off(){
        on = "off";
        System.out.println("The light is "+on);
    }

    public static void main(String[] args) {
        Light_Using_Objects button = new Light_Using_Objects();

        Scanner OBJ = new Scanner(System.in);
        System.out.println("Do you want to turn the lights on or off?");
        String choice = OBJ.nextLine();

        if (choice.equals("off")){
            button.Turn_Light_Off();
        }
        else  if (choice.equals("on")){
            button.Turn_Light_On();
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
