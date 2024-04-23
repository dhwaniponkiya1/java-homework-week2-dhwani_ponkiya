package homework_week2;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */

public class Program17ConvertDecimalToBinary {

    static void decToBinary(int n) {
        int[] binaryNum = new int[1000];
        int i = 0;
        while (n > 0) {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }

        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal number: ");
        int n = sc.nextInt();
        System.out.println("Decimal - " + n);
        System.out.print("Binary - ");
        decToBinary(n);
    }
}
