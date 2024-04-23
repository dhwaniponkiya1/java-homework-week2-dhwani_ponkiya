package homework_week2;

/**
 * Write a Java program to compute the specified expressions and print the
 * output.
 * Test Data:
 * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 * Expected Output : 2.138888888888889
 */

public class Program12MathFormula {

    public void calc() {
        double ans = ((25.5 * 3.5) - (3.5 * 3.5)) / (40.5 - 4.5);
        System.out.println("((25.5 * 3.5) - (3.5 * 3.5)) / (40.5 - 4.5) = "+ans);
    }

    public static void main(String[] args) {
        Program12MathFormula p = new Program12MathFormula();
        p.calc();
    }
}
