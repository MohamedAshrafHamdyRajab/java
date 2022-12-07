/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.javaasciiproject;
import java.util.Scanner;
/**
 *
 * @author MOHAMED ASHRAF
 */
public class JavaASCIIProject {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner input = new Scanner(System.in);       
        int work = 1;
        do
        {
            System.out.println("Are you want to know ASCII enter 1 , want to know Character enter 2");
            int choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("please enter a character");
                    char character1 = input.next().charAt(0);
                    int ASCII1 = (int) character1;
                    System.out.println("the ASCII code of " + character1 + " is " + ASCII1);
                    System.out.println("#########################");
                }
                case 2 -> {
                    System.out.println("please enter the ASCII code");
                    int ASCII2 = input.nextInt();
                    char character2 = (char) ASCII2;
                    System.out.println("the character of " + ASCII2 + " is " + character2);
                    System.out.println("#########################");
                }
                default -> System.out.println("please enter a valid value, 1 or 2");
            }
        }while(work == 1);
        
//        System.out.println("Are you want to know ASCII enter 1 , Character enter 2");
//        int choice = input.nextInt();
//        switch (choice) {
//            case 1 -> {
//                System.out.println("please enter a character");
//                char character1 = input.next().charAt(0);
////                int ASCII1 = (int) character1;
//                System.out.println("the ASCII code of " + character1 + " is " + (int)character1);
//            }
//            case 2 -> {
//                System.out.println("please enter the ASCII code");
//                int ASCII2 = input.nextInt();
//                char character2 = (char) ASCII2;
//                System.out.println("the character of " + ASCII2 + " is " + character2);
//            }
//            default -> System.out.println("please enter a valid value, 1 or 2");
//        }
    }
}
