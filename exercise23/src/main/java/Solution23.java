import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Lopes
 */

public class Solution23 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        String choice;
        System.out.print("Is the car silent when you turn the key? ");
        choice = in.next();

        if(choice.equals("y")) {

            System.out.print("Are the battery terminals corroded? ");
            choice = in.next();

            if(choice.equals("y"))
                System.out.print("Clean terminals and try starting again.");

            else
                System.out.print("Replace cables and try again.");
        }

        else {

            System.out.print("Does the car make a slicking noise?");
            choice = in.next();
            if(choice.equals("y"))
                System.out.print("Replace the battery.");

            else {
                System.out.print("Does the car crank up but fail to start?");
                choice = in.next();

                if(choice.equals("y"))
                    System.out.print("Check spark plug connections.");

                else {
                    System.out.print("Does the engine start and then die?");
                    choice = in.next();
                    if(choice.equals("y")) {
                        System.out.print("Does you car have fuel injection?");
                        choice = in.next();

                        if(choice.equals("y"))
                            System.out.print("Get it in for service.");
                        else
                            System.out.print("Check to ensure the choke is opening and closing");
                    }

                    else
                        System.out.print("This should not be possible.");
                }
            }
        }
    }
}
