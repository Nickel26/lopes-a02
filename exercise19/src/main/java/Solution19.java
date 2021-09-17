import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Lopes
 */
/*
Take users weight and height
Calculate bmi using formula
Print calculated bmi
Print if bmi is healthy or unhealthy
 */
public class Solution19 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        double weight = 0, height = 0, bmi = 0;
        System.out.print("What is your weight, in pounds? ");
        weight = in.nextInt();

        System.out.print("What is your height, in inches? ");
        height = in.nextInt();

        bmi = (weight / (height * height)) * 703;
        System.out.printf("Your BMI is %.1f\n", bmi);

        if(bmi < 25 && bmi > 18.5)
            System.out.print("You are within the ideal weight range");
        else
            System.out.println(bmi > 25? "You are overweight. You should see your doctor.": "You are underweight. You should see your doctor.");
    }

}
