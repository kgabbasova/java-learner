import java.util.Scanner;

public class PrintOut {
    public static void main(String[] args) {
        System.out.print("Enter a word: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        while (true) {
            System.out.println("How many times you want to repeat this word?");
            int n = Integer.valueOf(sc.nextLine());
            if (n == 0) {
                break;
            } else if (n > 0) {
                for (int i = 0; i < n; i++) {
                    System.out.println(word);
                }
                break;
            }
        }
    }
}
