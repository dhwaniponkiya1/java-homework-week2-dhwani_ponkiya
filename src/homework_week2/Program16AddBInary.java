package homework_week2;

import java.util.Scanner;

public class Program16AddBInary {

    public static void addBinary() {

    }

    public static void main(String[] args) {
        String b1, b2;
        System.out.println("Enter two binary numebrs: ");
        Scanner sc = new Scanner(System.in);
        b1 = sc.nextLine();
        b2 = sc.nextLine();
        int a = Integer.parseInt(b1, 2);
        int b = Integer.parseInt(b2, 2);

        int tempSum = a+b;
        String sum = Integer.toBinaryString(tempSum);
        System.out.println("Sum "+ sum);

    }
}
