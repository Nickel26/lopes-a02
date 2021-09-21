import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Lopes
 */
/*
Determine what starting temperature user inputs
Take user input for temperature
Calculate conversion using formula
Display converted temperature
 */

public class Solution18 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        String choice;
        double f_temp, c_temp;

        System.out.print("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.\n" +
                "Your choice: ");
        choice = in.next();

        if(choice.equals("c") || choice.equals("C")){
            System.out.print("Please enter the temperature in Fahrenheit: ");
            f_temp = in.nextDouble();

            c_temp = (f_temp - 32) * 5 / 9;
            System.out.printf("The temperature in Celsius is %.02f", c_temp);
        }

        else{
            System.out.print("Please enter the temperature in Celsius: ");
            c_temp = in.nextDouble();

            f_temp = (c_temp * 9 / 5) + 32;
            System.out.printf("The temperature in Fahrenheit is %.02f", f_temp);
        }
    }

}
