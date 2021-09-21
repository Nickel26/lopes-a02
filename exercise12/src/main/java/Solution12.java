import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Lopes
 */
/*
Take principal, interest rate, and time from user
Calculate the interest and store in integer a
Display time, rate and final interest
 */
public class Solution12 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        double p, a, r, t;

        System.out.print("Enter the principal: ");
        p = in.nextDouble();

        System.out.print("Enter the rate of interest: ");
        r = in.nextDouble();

        System.out.print("Enter the number of years: ");
        t = in.nextDouble();

        a = p * (1 + r * (t / 100));
        System.out.printf("After %.0f years at "+ r +"%%, the investment will be worth $%.02f", t, Math.ceil(a * 100) / 100);

    }

}
