import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Lopes
 */
/*
Prompt user for length and width and store inputs in designated ints
Calculate area in feet and meters using length and width
Display rooms area in feet and meters
 */
public class Solution07 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        String input;
        int length, width, area_ft;
        double area_m;

        System.out.print("What is the length of the room in feet?");
        input = in.next();
        length = Integer.parseInt(input);


        System.out.print("What is the width of the room in feet?");
        input = in.next();
        width = Integer.parseInt(input);

        area_ft = length * width;
        area_m = area_ft * 0.09290304;

        System.out.printf("You entered dimensions of %d feet by %d feet.\n", length, width);
        System.out.printf("The area is \n%d square feet \n%.3f square meters", area_ft, area_m);
    }

}
