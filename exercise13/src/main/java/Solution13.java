import java.util.Scanner;
import java.lang.Math;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Lopes
 */
/*
Take principal, interest rate, time, and number of times interest is compounded from user
Calculate the interest and store in integer a
Display time, rate, number of times interest is compounded, and final interest
 */
public class Solution13 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        double p, a, r, t, n, x ,y;

        System.out.print("What is the principal amount: ");
        p = in.nextDouble();

        System.out.print("What is the rate: ");
        r = in.nextDouble();

        System.out.print("What is the number of years: ");
        t = in.nextDouble();

        System.out.print("What is the number of times the interest is compounded per year? ");
        n = in.nextDouble();

        x = (1 + ((r / 100) / n));
        y = (n * t);
        a = p * Math.pow(x, y);

        System.out.printf(p +" invested at "+ r +"%% for %.0f years compounded "+ n +" times per year is $%.02f", t, Math.ceil(a * 100) / 100);

    }

}
