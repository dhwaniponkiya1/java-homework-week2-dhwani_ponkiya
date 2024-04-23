package homework_week2;

import java.util.Scanner;

public class Program6Area {

    /**
     * Write a program to enter any radius value of the circle and find out the
     * area.(Formula of Area A=PI*r*r).
     */

    public static void findArea(float r) {
        float area = 3.14f * r * r;
        System.out.println("Area of circle: "+ area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        float r =  sc.nextFloat();
        findArea(r);
    }
}
