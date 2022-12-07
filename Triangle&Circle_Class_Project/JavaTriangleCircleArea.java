/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.javatrianglecirclearea;
import java.util.Scanner;
public class JavaTriangleCircleArea {
//    methode for compute circumference of triangle
    static double triangleCircumference()
    {
        int userLength1 , userLength2 , userLength3;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the first length of the triangle");
        userLength1 = input.nextInt();
        System.out.println("please enter the second length of the triangle");
        userLength2 = input.nextInt();
        System.out.println("please enter the third length of the triangle");
        userLength3 = input.nextInt();
        Triangle triangle = new Triangle();
        double circumference = triangle.getTriangleCircumference(userLength1,userLength2,userLength3);
        return circumference;
    }
//    methode for compute area of triangle
    static double triangleArea()
    {
        int baseLength , height;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the base length of the triangle");
        baseLength = input.nextInt();
        System.out.println("please enter the height of the triangle");
        height = input.nextInt();
        Triangle triangle = new Triangle();
        double area = triangle.getTriangleArea(baseLength, height);
        return area;
    }
//    methode for compute circumference of circle
    static double circleCircumference()
    {
        int radius;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the radius of the circle");
        radius = input.nextInt();
        Circle circle = new Circle();
        double circumference = circle.getCircleCircumference(radius);
        return circumference;
    }
//    methode for compute area of circle
    static double circleArea()
    {
        int radius;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the radius of the circle");
        radius = input.nextInt();
        Circle circle = new Circle();
        double area = circle.getCircleArea(radius);
        return area;
    }
//    methode for display choice of user
    static void Choice()
    {
        int i = 0 , choice1 , choice2 ;
        while(i < 1)
        {
            System.out.println("for triangle press 1 , for circle press 2");
            Scanner input = new Scanner(System.in);
            choice1 = input.nextInt();
            if(choice1 == 1)
            {
                System.out.println("for triangle circumference press 1 , for triangle area press 2");
                choice2 = input.nextInt();
                if(choice2 == 1)
                    System.out.println("the circumference of the triangle = " + triangleCircumference());
                else if(choice2 == 2)
                    System.out.println("the area of the triangle = " + triangleArea());
            }
            else if(choice1 == 2)
            {
                System.out.println("for circle circumference press 1 , for circle area press 2");
                choice2 = input.nextInt();
                if(choice2 == 1)
                    System.out.println("the circumference of the circle = " + circleCircumference());
                else if(choice2 == 2)
                    System.out.println("the area of the circle = " + circleArea());
            }                    
        }
    }
    public static void main(String[] args) 
    {
        Choice();
    }
}
