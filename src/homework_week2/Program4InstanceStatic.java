package homework_week2;

/**
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme
 */
public class Program4InstanceStatic {

    int a=10,b=20;
    static int c=4,d=3;

    public void sum1(int a,int b, int c, int d){
        System.out.println("Sum 1: "+ (a+b+c+d));
    }

    public static void sum2(int a,int b, int c, int d){
        System.out.println("Sum 2: "+ (a+b+c+d));
    }

    public static void main(String[] args) {
        Program4InstanceStatic p = new Program4InstanceStatic();
        p.sum1(p.a,p.b,c,d);
        sum2(p.a,p.b,c,d);

    }
}
