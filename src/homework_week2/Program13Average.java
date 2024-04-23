package homework_week2;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers
 */

public class Program13Average {

    public static void getAverage(float a,float b, float c){
        float average = (a+b+c)/3;
        System.out.println("Average of "+a+" "+b+" "+c+" is "+average);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        getAverage(a,b,c);

    }
}
