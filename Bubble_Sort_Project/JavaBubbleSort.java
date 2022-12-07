/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javabubblesort;

import java.util.Scanner;

/**
 *
 * @author MOHAMED ASHRAF
 */
public class JavaBubbleSort {
    
//    methode to input the array from the user
    static int[] arrayInput()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the length of the array you want to sort");
        int length = input.nextInt();
        int array[] = new int[length];
        if(length <= 0)
        {
            System.out.println("please enter a valid length");
        }
        else
        {
            for(int i = 0 ; i < length ; i++)
            {
                System.out.println("enter the element number " + (i+1));
                array[i] = input.nextInt();
            }
        }
        return array;
    }
    
//    methode to sort the input array
    static int[] arraySort(int array[] , int sort)
    {
        for(int i = 0 ; i < array.length ; i++)
        {
            for(int j = 0 ; j < array.length-1 ; j++)
            {
                if(sort == 1)
                {
                    if(array[j] > array[j+1])
                    {
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;                          
                    }
                }
                else if(sort == 2)
                {
                    if(array[j] < array[j+1])
                    {
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }                       
                else
                    System.out.println("please enter valid choice");                    
            }          
        } 
        return array;
    }
    
//    methode to display the array
    static void arrayDisplay(int array[],int sort)
    {
//        if the sort = 1 then display the sorted array by ascending
        if(sort == 1)
        {
            String sortOrder = "the sorted array by Ascending :";
            System.out.println(sortOrder);
        }
//        if the sort = 2 then display the sorted array by descending
        else if(sort == 2)
        {
            String sortOrder = "the sorted array by Descending :";
            System.out.println(sortOrder);
        }
//        else then display the unsorted array
        else
            System.out.println("the unsorted array :");
        
        for(int k = 0 ; k < array.length ; k++)
        {
            System.out.print(array[k] + " ");
        }
        System.out.println("");
    }
    
//    methode to handle the program
    static void choice()
    {        
        int forever = 1;
        while(forever == 1)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("if you want Ascending sort press : 1 , for Descending sort press : 2");
            int sort = input.nextInt();
            if(sort == 1 || sort == 2)
            {
                int array[] = arrayInput();
                arrayDisplay(array,0);
                int sortedArray[] = arraySort(array,sort);            
                arrayDisplay(sortedArray,sort);            
            }
            else
                System.out.println("please enter a valid choice");
        }
    }
    
    public static void main(String[] args) {
        choice();
    }
}