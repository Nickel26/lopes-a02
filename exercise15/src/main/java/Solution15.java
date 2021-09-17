import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Lopes
 */

public class Solution15 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        String username, password, login_pass;

        System.out.print("Provide Username: ");
        username = in.next();
        System.out.print("Provide Password: ");
        password = in.next();

        System.out.print("What is the password? ");
        login_pass = in.next();

        if(login_pass.equals(password))
            System.out.print("Welcome!");

        else
            System.out.print("I don't know you.");
    }

}
