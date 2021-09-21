import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Lopes
 */
/*
Take 3 different numbers from user as input
If any numbers are similar prompt user that they are not different and end program
If all numbers are different compare two numbers and store greatest number in max
Compare max with remaining number and store greatest
Display max
 */

public class Solution22 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        int num1, num2, num3, max;

        System.out.print("Enter the first number: ");
        num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        num2 = in.nextInt();
        System.out.print("Enter the third number: ");
        num3 = in.nextInt();

        if(num1 == num2 || num1 == num3 || num2 == num3 ){
            System.out.print("Not all numbers are different");
            System.exit(1);
        }

        if(num1 > num2)
            max = num1;
        else
            max = num2;

        if(num3 > max)
            max = num3;

        System.out.printf("The largest number is %d", max);
    }

}
