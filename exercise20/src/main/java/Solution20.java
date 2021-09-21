import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Lopes
 */
/*
Take order amount, state, and county from user
If State has a tax rate apply it and add to tax
If county has a tax rate apply it and add to tax
Add tax and subtotal and store in total
Display tax, subtotal, and total
 */
public class Solution20 {
    static final double WI = .05, EC = 0.005, DUN = 0.004, IL = .08;
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        String state, county;
        double amount, tax = 0, total = 0;

        System.out.print("What is the order amount? ");
        amount = in.nextDouble();

        System.out.print("What state do you live in: ");
        state = in.next();

        in.nextLine();

        System.out.print("What county do you live in: ");
        county = in.nextLine();

        if(state.equals("Wisconsin")){
            tax += WI * amount;
            tax = Math.ceil(tax * 1000) / 1000;

            if(county.equals("Dunn")){
                tax += DUN * amount;
                tax = Math.ceil(tax * 1000) / 1000;
            }

            if(county.equals("Eau Claire")){
                tax += EC * amount;
                tax = Math.ceil(tax * 1000) / 1000;
            }
        }

        if(state.equals("Illinois")){
            tax += IL * amount;
            tax = Math.ceil(tax * 1000) / 1000;
        }

        total = tax + amount;
        System.out.printf("The tax is $%.02f.\nThe total is $%.02f.", tax, total);
    }

}
