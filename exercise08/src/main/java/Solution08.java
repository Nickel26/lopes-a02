import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Lopes
 */
/*
Prompt user for number of people
Prompt user for number of pizzas
Prompt user for number of slices on pizzas
Calculate total slices by multiplying number of slices by number of pizzas
Display number of pizzas and number of people
Display how many slices each person gets
Display leftover slices
 */
public class Solution08 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        String input;
        int people, pizza, slices, tot_slice;

        System.out.print("How many people? ");
        input = in.next();
        people = Integer.parseInt(input);

        System.out.print("How many pizzas do you have? ");
        input = in.next();
        pizza = Integer.parseInt(input);

        System.out.print("How many slices per pizza? ");
        input = in.next();
        slices = Integer.parseInt(input);

        tot_slice = slices * pizza;

        System.out.printf("%d people with %d pizzas (%d slices)\n", people, pizza, tot_slice);
        System.out.printf("Each person gets %d pieces of pizza.\n", tot_slice / people );
        System.out.printf("There are %d leftover pieces.", (tot_slice - ((tot_slice / people)) * people));

    }

}
