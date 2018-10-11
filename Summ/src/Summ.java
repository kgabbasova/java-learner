import java.util.Scanner;

public class Summ {
    public static void main (String [] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (int i =2; i<= n; i++) {
            sum += 1.0/i;
        }
        System.out.println(1-sum);
    }
}
