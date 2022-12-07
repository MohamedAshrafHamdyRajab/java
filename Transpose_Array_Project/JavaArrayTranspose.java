/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.javaarraytranspose;
import java.util.Scanner;
public class JavaArrayTranspose {
//    methode to get the array from the user
    static int[][] inputArray(int rows, int cols)
    {
        Scanner input = new Scanner(System.in);
        int array[][] = new int[rows][cols];
        for(int i = 0 ; i < rows ; i++)
        {
            for(int j = 0 ; j < cols ; j++)
            {
                System.out.println("please enter the cell [" + i + "]" + "[" + j + "]");
                array[i][j] = input.nextInt();
            }
        }
        return array;
    }
//    methode to user the array
    static int[][] transposeArray(int[][] array , int rows , int cols)
    {
        int transpose[][] = new int[cols][rows];
        for(int i = 0 ; i < rows ; i++)
        {
            for(int j = 0 ; j < cols ; j++)
            {
                transpose[j][i] = array[i][j];
            }
        }
        return transpose;
    }
//    methode to display the transposed array
    static void displayTransposeArray(int trans[][] , int rows , int cols)
    {
        for(int i = 0 ; i < cols ; i++)
        {
            for(int j = 0 ; j < rows ; j++)
            {
                System.out.print(trans[i][j] + "  ");
            }
            System.out.println(" ");
        }
    } 
//    methode to display the user array
    static void displayUserArray(int array[][] , int rows , int cols)
    {
        for(int i = 0 ; i < rows ; i++)
        {
            for(int j = 0 ; j < cols ; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }        
    }  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the rows and cols lengthes of the array");
        int rows = input.nextInt();
        int cols = input.nextInt();
        int array[][] = inputArray(rows,cols);
        int transpose[][] = transposeArray(array,rows,cols);
        System.out.println("your array");
        displayUserArray(array,rows,cols);
        System.out.println("###########");
        System.out.println("the transpose array");
        displayTransposeArray(transpose,rows,cols);           
    }
}