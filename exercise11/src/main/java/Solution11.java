import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Lopes
 */
/*
Take amount of euros from user
Take exchange rate from user
Calculate the exchange by multiplying rate with euros
Display exchanged currency
 */
public class Solution11 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        double c_to, c_from, rate;

        System.out.print("How many euros are you exchanging? ");
        c_from = in.nextDouble();
        System.out.print("What is the exchange rate? ");
        rate = in.nextDouble();

        c_to = c_from * rate;
        System.out.printf(c_from + " euros at an exchange rate of "+ rate +" is %.2f U.S. dollars.", Math.ceil(c_to * 100.0) / 100.0);
    }

}
