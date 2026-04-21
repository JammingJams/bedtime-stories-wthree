package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class ReadingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] bookTitles = {"Hansel and Gretel", "Goldilocks and the three bears", "Mary had a little lamb"};
        String[] bookDirectory = {"src/main/resources/hansel_and_gretel.txt", "src/main/resources/goldilocks.txt" , "src/main/resources/mary_had_a_little_lamb.txt"};
        int userInput;

        try {
            System.out.println("Welcome to our Bedtime Stories!\nWe offer we three different stories for our readers!");
            System.out.println("(1) " + bookTitles[0]);
            System.out.println("(2) " + bookTitles[1]);
            System.out.println("(3) " + bookTitles[2]);
            System.out.print("Please type in the number adjacent to the story you want to select!: ");
            userInput = sc.nextInt();
            sc.nextLine();

            FileReader fileReader = new FileReader(bookDirectory[userInput - 1]);

            BufferedReader bufReader = new BufferedReader(fileReader);


            while ((bookDirectory[userInput - 1] = bufReader.readLine()) != null) {
                System.out.println(bookDirectory[userInput - 1]);
            }
        }
        catch(IOException e) {
                e.printStackTrace();
            }




    }
}
