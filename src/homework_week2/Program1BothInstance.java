package homework_week2;

/**
 * Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */

public class Program1BothInstance {

    int a = 10;
    String product = "Fruit";

    public void printPrice(){
        System.out.println("Price of "+product+" is "+a);
    }

    public static void main(String[] args) {
        Program1BothInstance p = new Program1BothInstance();
        p.printPrice();
    }

}
