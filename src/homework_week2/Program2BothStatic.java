package homework_week2;

/**
 * Write a Java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */

public class Program2BothStatic {

    static int id = 5;
    static String name = "Dhwani";

    public static void print(){
        System.out.println("ID is "+id);
        System.out.println("Name is "+name);
    }

    public static void main(String[] args) {
        print();
    }
}
