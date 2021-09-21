import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Lopes
 */
/*
Take inputs for length and width from user
Calculate area by multiplying length and width
Use conversion rate to find how much paint is needed for area
Display amount of paint needed for area
 */
public class Solution09 {
    private static final Scanner in = new Scanner(System.in);
    static final double CON_RATE = (0.00285714285);
    public static void main(String[] args){
        String input;
        int length, width;
        double  paint, area;

        System.out.print("What is the length?");
        input = in.next();
        length = Integer.parseInt(input);

        System.out.print("What is the width?");
        input = in.next();
        width = Integer.parseInt(input);

        area = length * width;
        paint = area * CON_RATE;
        System.out.printf("You will need to purchase %.0f gallons of paint to cover %.0f square feet", Math.ceil(paint), area);


    }

}
