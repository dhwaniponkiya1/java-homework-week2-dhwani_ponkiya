package homework_week2;

/**
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Program3InstanceStatic {

    int id = 101;
    static String name = "Dhwani";

    public void instanceMethod(int id, String name){
        System.out.println("Instance method");
        System.out.println(id);
        System.out.println(name);
    }

    public static void staticMethod(int id, String name){
        System.out.println("Static method");
        System.out.println(id);
        System.out.println(name);
    }

    public static void main(String[] args) {
        Program3InstanceStatic p = new Program3InstanceStatic();
        p.instanceMethod(p.id, name);
        staticMethod(p.id, name);
    }
}
