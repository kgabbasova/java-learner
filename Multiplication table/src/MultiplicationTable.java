import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.print("Please, enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lengthMax= String.valueOf(n*n).length();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int result = i*j;
                int lengthNum = String.valueOf(result).length();
                for (int l = lengthNum; l < lengthMax; l++) {
                    System.out.print(' ');
                }
                System.out.print(result + " ");
//                System.out.print(String.format("%5d", i * j));
//                System.out.print(String.format("%" +lengthMax +"d", i * j));
            }
            System.out.println();
        }
    }
}
