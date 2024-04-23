package homework_week2;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */

public class Program8AreaTriangle {

    public static void area(float base, float height) {
        float areaOfTriangle = (base * height) / 2;
        System.out.println("Area of Triangle: " + areaOfTriangle);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base");
        float base = sc.nextInt();
        System.out.println("Enter height");
        float height = sc.nextInt();
        area(base, height);
    }
}
