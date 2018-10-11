import java.util.Random;

public class Simple {

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int binarySearch(int n, int[] arr) {
        int begin = 0;
        int end = arr.length - 1;
        int middle = (begin + end) / 2;
        while (begin != arr.length && end >= 0) {
            if (arr[middle] == n) {
                return middle;
            } else {
                if (arr[middle] < n) {
                    begin = middle + 1;
                    middle = (begin + end) / 2;
                } else if (arr[middle] > n) {
                    end = middle - 1;
                    middle = (begin + end) / 2;
                }
            }
        }
        return -1;
    }


    public static int[] bubbleSort(int[] arr) {
        int k = 0;                      //последний измененный индекс
        int maxindex = arr.length;
        boolean swap = false;
        while (!swap) {
            swap = false;
            for (int i = 1; i < maxindex; i++) {
                if (arr[i] < arr[i - 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = tmp;
                    swap = true;
                    k = i;
                }
            }
            maxindex = k;
        }
        return arr;
    }


    public static int max(int[] arr) {
        int maxNumb = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNumb) {
                maxNumb = arr[i];
            }
        }
        return maxNumb;
    }

    public static void main(String args[]) {
        int[] rand = new int[10];
        for (int i = 0; i < 10; i++) {
//           Random r = new Random();
//            rand [i] = r.nextInt();
            rand[i] = (int) (Math.random() * 100);
            System.out.print(rand[i] + " ");
        }
        System.out.println();
        System.out.println("Maximum is: " + max(rand));
        print(bubbleSort(rand));
//        int[] sorted = bubbleSort(rand);
//        int [] n = {6, 5, 4, 3, 2, 1};
//        print(bubbleSort(n));
//        int k = binarySearch(10000, sorted);
//        System.out.println(k);

    }

}


/*
    1.сортировка пузырьком;
    2.бинарный поиск (без деревьев) start, end, mid;
    3. Arrays (проверка - сортировка и поиск).

*/


