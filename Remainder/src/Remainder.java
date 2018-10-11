import java.util.Scanner;

public class Remainder {
    public static void main (String [] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        int [] array = {2, 4, 11, 25};
        for (int i : array) {
            System.out.println("Remainder of division by " + i + " = " + n%i);
        }
    }
}
