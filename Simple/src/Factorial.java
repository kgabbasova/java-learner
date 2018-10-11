public class Factorial {
    public static int factorial (int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        if (n == 1 || n ==0) {
            return 1;
        }
        if (n == 1) {
            return n;
        }
        return factorial((n-1)) *n;
    }


    public static void main (String [] args) {
        System.out.println(factorial(5));
    }
}


/*
1. треугольник Паскаля
1.1 Через массивы
1.2 Через формулу каждого элемента
1.3 Красиво вывести

2. Функция Фибоначчи

3. Правильно ли расставлены скобки в строке (рекурсивно)

4. + то же самое с 3мя типами скобок (){}[]



codingBat
JavaRush
 */
