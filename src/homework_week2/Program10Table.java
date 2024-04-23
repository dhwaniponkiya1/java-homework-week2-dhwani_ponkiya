package homework_week2;

import java.util.Scanner;

/**
 * Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 */

public class Program10Table {

    public static void printTable(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n+"x"+i+"="+(n*i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        printTable(number);
    }

}
