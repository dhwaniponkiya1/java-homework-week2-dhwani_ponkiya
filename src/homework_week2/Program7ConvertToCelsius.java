package homework_week2;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C)
 */

public class Program7ConvertToCelsius {

    public static void convertTemp(float f){
        float celsius = ((f-32)*5)/9;
        System.out.println("Temerature in celsius is: "+ celsius);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit : ");
        float f =  sc.nextFloat();
        convertTemp(f);
    }
}
