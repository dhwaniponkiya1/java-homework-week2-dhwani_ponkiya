package homework_week2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Write a Java Program to print as below.
 * "+------------------------+"
 * "| |"
 * "| CORNER STORE |"
 * "| |"
 * "| 2015-03-29 04:38PM |"
 * "| |"
 * "| Gallons: 10.870 |"
 * "| Price/gallon: $ 2.089 |"
 * "| |"
 * "| Fuel total: $ 22.71 |"
 * "| |"
 * "+------------------------+"
 */

public class Program20PrintBill {

    public static void printReciept(String date, long time, float gallons, float price) {
        System.out.println("\"+------------------------+\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"|      CORNER STORE      |\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"|"+date+"     "+"|\"");
        System.out.println("\"|                        |\"");
        System.out.printf("\"|Gallons:            %.2f|\"%n",gallons);
        System.out.printf("\"|Price/gallon:       %.2f|\"%n",price);
        System.out.println("\"|                        |\"");
        System.out.printf("\"|Fuel total:        %.2f|\"%n",gallons*price);
        System.out.println("\"|                        |\"");
        System.out.println("\"+------------------------+\"");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Gallons");
        float gallons = sc.nextFloat();
        System.out.println("Enter price");
        float price = sc.nextFloat();

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date d = new Date();
        String date =  dateFormat.format(d);
        long time = d.getTime();

        printReciept(date, time, gallons, price);
    }
}
