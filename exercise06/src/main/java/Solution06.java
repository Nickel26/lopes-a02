import java.util.Calendar;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Lopes
 */
/*
Prompt user for current age and store input in int age
Prompt user for retirement age and store input in int ret_age
Display years left till retirement (retirement age - age)
Display current year and retirement year (current year + (retirement age - age))
 */

public class Solution06 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String input;
        int age, ret_age;
        Calendar cal = Calendar.getInstance();

        System.out.print("What is your current age?");
        input = in.next();
        age = Integer.parseInt(input);

        System.out.print("At what age would you like to retire?");
        input = in.next();
        ret_age = Integer.parseInt(input);

        System.out.printf("You have %d years left until you can retire.\n", ret_age - age);
        System.out.printf("It's %d, so you can retire in %d.",cal.get(Calendar.YEAR) , (cal.get(Calendar.YEAR)) + (ret_age - age));
        }
    }


