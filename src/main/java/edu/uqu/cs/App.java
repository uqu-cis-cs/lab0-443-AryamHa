package edu.uqu.cs;
/*
 * Lab 0 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/
import java.util.Scanner;

import javax.net.ssl.SSLEngine;

public class App{

/**  
*  Complete method "twisters" definition below. The method prints all numbers from 1 to 110, 11 numbers per line. 
* Also, it does the following:
* - If the number is a multiple of 2, print "Tweetle"
* - If the number is a multiple of 4, print "Beetle"
* - If the number is a multiple of 6, print "Poodle"
* - Otherwise just print the number
* 
* Output: 
*        1 Tweetle 3 TweetleBeetle 5 TweetlePoodle 7 TweetleBeetle 9 Tweetle 11
*        TweetleBeetlePoodle 13 Tweetle 15 TweetleBeetle 17 TweetlePoodle 19 TweetleBeetle 
*/

/**
* Write a method named "phoneKeypad" that takes a string parameter (str)
* then it replaces each letter in (str) by a number that represnts it 
* in a phone keypad as follows: 
* ABC = 2;
* DEF = 3;
* GHI = 4;
* JKL = 5;
* MNO = 6;
* PQRS = 7;
* TVU = 8; 
* WXYZ = 9
*
* Example:
* Input: calling batman
* Output: 2255464228626
*
*/
 
    public static void main(String [] args) {
        

        /* Write your code here */
    // Scanner scnr = new Scanner(System.in);
    // System.out.println("Enter a string ");
    // phoneKeypad(scnr.nextLine());
    twisters();
       //call method twisters()
       //prompt user to enter a string 
       //call method phoneKeypad(string)


    }
    public static void twisters(){
    for(int c = 1; c<=110; c++){
        
if (c%2==0){
    System.out.print("Tweetle");
    
if (c%4==0)
    System.out.print("Beetle");


if (c%6==0)
    System.out.print("Poodle");
}
else
    System.out.print(" "+c+" ");
    }
    }

public static void phoneKeypad(String str){
for(char cha :str.toUpperCase().toCharArray()){
    switch (cha){
        case'A':
        case'B':
        case'C':
        System.out.print("2");
        break;
        case'D':
        case'E':
        case'F':
        System.out.print("3");
        break;
        case'G':
        case'H':
        case'I':
        System.out.print("4");
        break;
        case'J':
        case'K':
        case'L':
        System.out.print("5");
        break;
        case'M':
        case'N':
        case'O':
        System.out.print("6");
        break;
        case'P':
        case'Q':
        case'R':
        case'S':
        System.out.print("7");
        break;
        case'T':
        case'V':
        case'U':
        System.out.print("8");
        break;
        case'W':
        case'X':
        case'Y':
        case'Z':
        System.out.print("9");
        default:
    
    }
   // System.out.print(r);
    }
}
}

