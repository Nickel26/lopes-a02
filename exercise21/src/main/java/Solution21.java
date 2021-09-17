import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Lopes
 */
/*
Take number of the month from user
Check each case until number matches with case
Set month to number case
Display month name associated with number
 */

public class Solution21 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        String month = "January";
        int num;

        System.out.print("Please enter the number of the month: ");
        num = in.nextInt();

        switch(num){
            case 1: month = "January";
                break;
            case 2: month = "February";
                break;
            case 3: month = "March";
                break;
            case 4: month = "April";
                break;
            case 5: month = "May";
                break;
            case 6: month = "June";
                break;
            case 7: month = "July";
                break;
            case 8: month = "August";
                break;
            case 9: month = "September";
                break;
            case 10: month = "October";
                break;
            case 11: month = "November";
                break;
            case 12: month = "December";
                break;
        }

        System.out.printf("The name of the month is "+ month);
    }

}
