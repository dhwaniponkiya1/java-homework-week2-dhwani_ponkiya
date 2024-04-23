package homework_week2;

import java.util.Scanner;

/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */

public class Program18BODMAS {

    static void addition(int n1, int n2){
        System.out.println(n1+" + "+n2+" = "+(n1+n2));
    }

    static void subtraction(int n1, int n2){
        System.out.println(n1+" - "+n2+" = "+(n1-n2));
    }

    static void multiplication(int n1, int n2){
        System.out.println(n1+" x "+n2+" = "+(n1*n2));
    }

    static void division(int n1, int n2){
        System.out.println(n1+" / "+n2+" = "+(n1/n2));
    }

    static void remainder(int n1, int n2){
        System.out.println(n1+" mod "+n2+" = "+(n1%n2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();

        addition(n1, n2);
        multiplication(n1, n2);
        subtraction(n1, n2);
        division(n1, n2);
        remainder(n1, n2);
    }

}
