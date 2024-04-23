package homework_week2;

import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */

public class Program5Calculator {

    public static void addition(int a, int b){
        System.out.println("Addition of two numbers: "+(a+b));
    }

    public static void subtraction(int a, int b){
        System.out.println("Subtraction of two numbers: "+(a-b));
    }

    public void multiplication(int a, int b){
        System.out.println("Multiplication of two numbers: "+(a*b));
    }

    public void division(int a, int b){
        System.out.println("Division of two numbers: "+(a/b));

    }

    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        Program5Calculator p = new Program5Calculator();
        addition(a,b);
        subtraction(a,b);
        p.multiplication(a,b);
        p.division(a,b);
    }
}
