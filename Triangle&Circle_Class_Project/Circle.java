/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javatrianglecirclearea;
public class Circle 
{
    private int radius;
    public double getCircleCircumference(int userRadius)
    {
        radius = userRadius;
        double circumference = ((2)*(3.14)*(radius));
        return circumference;
    }
    public double getCircleArea(int userRadius)
    {
        radius = userRadius;
        double area = ((3.14)*(radius)*(radius));
        return area;
    }
}
