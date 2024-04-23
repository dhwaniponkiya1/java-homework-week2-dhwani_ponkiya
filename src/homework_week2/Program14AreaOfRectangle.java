package homework_week2;

import java.util.Scanner;

/**
 * Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 * Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

public class Program14AreaOfRectangle {

    public void getResult(float height, float width) {
        float area = height * width;
        float perimeter = 2 * (height + width);
        System.out.println("Area of rectangle: " + area);
        System.out.println("Perimeter of rectangle: " + perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter height and width: ");
        float height = sc.nextFloat();
        float width = sc.nextFloat();

        Program14AreaOfRectangle p = new Program14AreaOfRectangle();
        p.getResult(height, width);
    }
}
