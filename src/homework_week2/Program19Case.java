package homework_week2;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 *  Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 *  Output: the quick brown fox jumps over the lazy dog.
 */

public class Program19Case {
    public static void convertCaseToLower(String changeCase) {
        String result = changeCase.toLowerCase();
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String statement = sc.nextLine();
        convertCaseToLower(statement);
    }
}
