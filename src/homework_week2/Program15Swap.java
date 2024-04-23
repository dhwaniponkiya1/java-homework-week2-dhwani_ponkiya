package homework_week2;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */

public class Program15Swap {
    public static void swap(int n1, int n2){
        int temp;
        temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("Number 1: "+n1);
        System.out.println("Number 2: "+n2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1 and number 2: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        swap(n1,n2);
    }
}
