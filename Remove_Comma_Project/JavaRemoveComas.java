/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.javaremovecomas;
import java.util.Scanner;
public class JavaRemoveComas {
//    methode for take the input sentence form user
    static String inputUserSentence()
    {
        Scanner input = new Scanner(System.in);
        String inputSentence = input.nextLine();
        return inputSentence;
    }
//   methode for remove the comas from the sentence 
    static String removeComas(String sentence)
    {        
        String newSentence = "";
        for(int i = 0 ; i < sentence.length() ; i++)
        {
            char ch = sentence.charAt(i);
            if(ch != ',')
            {                
                newSentence = newSentence + ch;
            }
        }
        return newSentence;
    }
//    methode for display the new sentence
    static void displayNewSentence(String newSentence)
    {
        System.out.println(newSentence);   
    }
    public static void main(String[] args) {
        System.out.println("please enter your sentence");
        System.out.println("this sentence without comas");
        displayNewSentence(removeComas(inputUserSentence()));
    }
}
