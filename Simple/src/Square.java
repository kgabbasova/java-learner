public class Square {

    public static double calcSquareCircle (double r) {
        return (Math.PI * r*r);
    }

    public static double calcSquareTriangle (double c, double h) {
        return c*h/2;
    }

    public static double calcSquareRectangle (double a, double b) {
        return a*b;
    }

    public static void main (String [] args) {
        System.out.println("Circle's square is "+  String.format("%.2f",calcSquareCircle( 3.0)));
        System.out.println("Triangle's square is " + String.format("%.2f",calcSquareTriangle(10, 5)));
        System.out.println("Rectangle's square is " + String.format("%.2f",calcSquareRectangle(5.6, 7.8)));
    }
}


