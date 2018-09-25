import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Divisors {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Divisors of " +n +": ");
        double root = Math.sqrt(n);
        Set<Integer> divisors = new TreeSet<Integer>();
        divisors.add(1);
        for (int i = 2; i <= root; i++) {
            if (n % i == 0) {
                divisors.add(i);
                divisors.add(n / i);
            }
        }
        divisors.add(n);
        for (Integer i : divisors) {
            System.out.print(i);
            if (i == n) {
                continue;
            }
            System.out.print(", ");
        }
    }
}
