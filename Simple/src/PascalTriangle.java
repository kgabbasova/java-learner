import java.util.ArrayList;

public class PascalTriangle {

    public static void printPascalTriangleWithArr(int n) {

        //create rows
        int[][] triangleMatrix = new int[n][];

        //initialize
        for (int i = 0; i < n; i++) {
            triangleMatrix[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    triangleMatrix[i][j] = 1;
                } else {
                    triangleMatrix[i][j] = triangleMatrix[i - 1][j - 1] + triangleMatrix[i - 1][j];
                }
            }
        }

        int maxLength = String.valueOf(triangleMatrix[n - 1][n / 2]).length();
        int maxSpace = (int) (maxLength * n + n-1);
        int [] lineLenght = new int[n];
        for (int i=1; i<= n; i++) {
            lineLenght[i-1] = (int) (maxLength * i + i-1);
        }



        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (maxSpace-lineLenght[i])/2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(String.format("%" + maxLength + "d", triangleMatrix[i][j]) + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        printPascalTriangleWithArr(9);
    }
}


/*
1. треугольник Паскаля
1.1 Через массивы
1.2 Через формулу каждого элемента
1.3 Красиво вывести
*/