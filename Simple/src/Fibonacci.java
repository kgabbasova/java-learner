/**
 * Fibonacci function
 */

import java.util.Scanner;

public class Fibonacci {
    public static long [] fibonacci (int n) {
        if (n < 0) {
            throw new IllegalArgumentException ("Unavailable number!");
        }
        long[] fibArr = new long[n + 1];
        fibArr[0] = 0;
        fibArr[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            fibArr[i] = fibArr[i - 2] + fibArr[i - 1];
            System.out.print(fibArr[i] + " ");
        }
        return fibArr;
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        fibonacci(n);
    }
}
