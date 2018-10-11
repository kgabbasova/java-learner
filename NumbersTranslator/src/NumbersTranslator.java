import java.util.ArrayList;
import java.util.Scanner;

public class NumbersTranslator {
    public static void Calculate(int n, int numSys) {
        ArrayList<Integer> sysArr = new ArrayList<Integer>();
        while (n >= numSys) {
            sysArr.add(n % numSys);
            n /= numSys;
        }
        sysArr.add(n);

        if (numSys < 10) {          //вывод на консоль - только цифры
            for (int i = sysArr.size() - 1; i >= 0; i--) {
                System.out.print(sysArr.get(i));
            }
        } else {                    //вывод с буквенными обозначениями
            for (int i = sysArr.size() - 1; i >= 0; i--) {
                if (sysArr.get(i) < 10) {
                    System.out.print(sysArr.get(i));
                } else {
                    System.out.print((char) ('A' + (sysArr.get(i) - 10)));
                }
            }
        }
    }


    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Select a numeral system: ");
        int numSys = sc.nextInt();
        if (numSys == 0 || numSys > 26) {
            throw new IllegalArgumentException("Unavailable value!");
        }
        Calculate(n, numSys);
    }
}
