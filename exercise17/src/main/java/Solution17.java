import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Lopes
 */
/*
Take gender, amount of alcohol, weight, and time since last drink from user
If user input 1 for gender use male distribution ratio
If user input 2 for gender use female distribution ratio
After BAC calculated check if it is above or below legal amount
Display if user is able to legally drive
 */

public class Solution17 {
    static final double LEGAL_BAC = 0.08, MALE = 0.73, FEMALE = 0.66;
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
    double alc, weight, hours, gender, bac;

    System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
    gender = in.nextInt();

    System.out.print("How many ounces of alcohol did you have? ");
    alc = in.nextInt();

    System.out.print("What is your weight, in pounds? ");
    weight = in.nextInt();

    System.out.print("How many hours has it been since your last drink? ");
    hours = in.nextInt();

    if(gender == 1){
        bac = (alc * 5.14 / weight * MALE) - 0.015 * hours;
    }
    else{
        bac = (alc * 5.14 / weight * FEMALE) - 0.015 * hours;
    }

    System.out.printf("Your BAC is %f\n", bac);
    System.out.println(bac < LEGAL_BAC?"It is legal for you to drive.":"It is not legal for you to drive.");
    }

}
