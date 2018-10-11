import java.util.Scanner;
import java.math.BigInteger;

public class Program {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());

        try {
            BigInteger factorial = Factorial.calculate(n);
            System.out.println(factorial);
        }
        catch(IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
