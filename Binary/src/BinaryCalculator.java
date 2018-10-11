import java.util.Scanner;

public class BinaryCalculator {
    public static void Binary(int n) {
        StringBuilder bin = new StringBuilder();
        while (n != 1) {
            bin.append(String.valueOf(n % 2));
            n /= 2;
        }
        bin.append('1');
        System.out.print(bin.reverse());
    }

    public static void main(String[] args) {
        System.out.print("Please, enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println('0');
        } else {
            Binary(n);
        }
    }
}

