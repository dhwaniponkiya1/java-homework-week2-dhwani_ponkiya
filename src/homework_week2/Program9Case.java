package homework_week2;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case
 */

public class Program9Case {

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
