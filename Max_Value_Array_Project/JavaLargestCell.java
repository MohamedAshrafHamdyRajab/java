/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javalargestcell;
import java.util.Scanner;
public class JavaLargestCell {
    
//    methode to input the array from the user
    static int[][] inputArray(int row, int col)
    {
        int array[][] = new int[row][col];
        Scanner input = new Scanner(System.in);
        for(int i = 0 ; i < row ; i++)
        {
            for(int j = 0 ; j < col ; j++)
            {
                System.out.println("please enter the cell [" + i + "]" + "[" + j + "]");
                array[i][j] = input.nextInt();
            }
        }
        return array;
    }
//    methode to get the bigest number in the array
    static int biggestNumber(int arr[][])
    {
        int bigest = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[0].length ; j++)
            {
                if(arr[i][j] > bigest)
                {
                    bigest = arr[i][j];
                }
            }
        }
        return bigest;
    } 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the rows and cols length");       
        int row = input.nextInt();
        int col = input.nextInt();
        int bigest = biggestNumber(inputArray(row,col));
        System.out.println("the biggest number in the array is " + bigest);       
    }
}