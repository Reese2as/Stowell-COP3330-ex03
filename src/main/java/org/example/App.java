
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Reese Stowell
 */
package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner user_input = new Scanner(System.in);
        String quote, name;
        System.out.print("What is the quote? ");
        quote = user_input.nextLine();
        System.out.print("Who said it? ");
        name = user_input.nextLine();
        System.out.println(String.format("%s says,\"%s\"",name,quote));
    }
}
