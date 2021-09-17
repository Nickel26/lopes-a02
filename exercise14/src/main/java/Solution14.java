import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Lopes
 */
/*
Get order amount and state from user
If state is "WI" calculate 5.5% tax
Once tax is calculated add with subtotal and store total
Display total for user
 */
public class Solution14 {
    static final double WI = .055;
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        String state;
        double sub_tot, total, tax;

        System.out.print("What is the order amount? ");
        sub_tot = in.nextDouble();

        System.out.print("What is the state? ");
        state = in.next();

        if(state.equals("WI")){
            tax = sub_tot * WI;
            total = sub_tot + tax;
            System.out.printf("The subtotal is $%.02f\nThe tax is $%.02f\nThe total is $%.02f", sub_tot, tax, total);
        }

        if(!state.equals("WI")) {
            total = sub_tot;
            System.out.printf("The total is $%.02f", total);
        }
    }


}
