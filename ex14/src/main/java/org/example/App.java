package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 hudson millar
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        Scanner scam = new Scanner(System.in);

        System.out.println( "How many orders?" );
        int num = scan.nextInt();

        System.out.println( "What is the state?" );
        String word = scam.nextLine();
        double mun = num;
        if(word.equals("WI")){
            mun += num*.055;
        }
        System.out.println( mun );
    }
}
