import java.util.Scanner;

public class FunctionY {
    public static boolean isIn(double a, double b, double x0, double y0) {
        boolean isIn = false;
        if (Math.abs(((y0 - b) - a * x0)) < 0.1e-10) {
            isIn = true;
        }
        return isIn;
    }

    public static void main(String[] args) {
        System.out.print("Please, enter  coefficients: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.print("Enter coordinates: ");
        double x0 = sc.nextDouble();
        double y0 = sc.nextDouble();
        if (isIn(a, b, x0, y0) == true) {
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }
    }
}
