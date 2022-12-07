/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javatrianglecirclearea;
public class Triangle 
{
    private int firstLength ;
    private int secondLength;
    private int thirdLength;
    private int baseLength;
    private int height;
    public double getTriangleCircumference (int userLength1 , int userLength2 , int userLength3)
    {
        firstLength = userLength1;
        secondLength = userLength2;
        thirdLength = userLength3;
        double circumference = firstLength + secondLength + thirdLength;
        return circumference;        
    }
    public double getTriangleArea (int userBaseLength , int userHeight)
    {
        baseLength = userBaseLength;
        height = userHeight;
        double area = ((.5*baseLength)*height);
        return area;
    }
}
