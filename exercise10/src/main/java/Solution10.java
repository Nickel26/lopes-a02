import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Lopes
 */
/*
Take prices and quantities of 3 items from user
Multiply prices and quantities together to find subtotal
Multiply subtotal by tax rate to calculate tax
Add tax and subtotal together to get total
Display Tax total and Subtotal for user
 */
public class Solution10 {
    private static final Scanner in = new Scanner(System.in);
    static final double TAX_RATE = 0.055;
    public static void main(String[] args){
        int item1, item2, item3;
        double price1, price2, price3, sub_tot = 0, total, tax;

        System.out.print("Enter the price of item 1: ");
        price1 = in.nextInt();
        System.out.print("Enter the quantity of item 1: ");
        item1 = in.nextInt();
        sub_tot += (price1 * item1);

        System.out.print("Enter the price of item 2: ");
        price2 = in.nextInt();
        System.out.print("Enter the quantity of item 2: ");
        item2 = in.nextInt();
        sub_tot += (price2 * item2);

        System.out.print("Enter the price of item 3: ");
        price3 = in.nextInt();
        System.out.print("Enter the quantity of item 3: ");
        item3 = in.nextInt();
        sub_tot += (price3 * item3);

        tax = TAX_RATE * sub_tot;
        total = tax + sub_tot;

        System.out.printf("Subtotal: %.2f\n", sub_tot);
        System.out.printf("Tax: %.2f\n", tax);
        System.out.printf("Total: %.2f\n", total);
    }

}
