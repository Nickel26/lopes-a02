import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Lopes
 */
/*
Take user age
Compare age with legal driving age
Display if user is legally able to drive or not
 */
public class Solution16 {
    static final int AGE = 16;
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        int user_age;

        System.out.print("What is your age? ");
        user_age = in.nextInt();

        System.out.println(user_age >= AGE ? "You are old enough to legally drive." : "You are not old enough to legally drive.");



    }

}
