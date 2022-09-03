package Package.Functions;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        System.out.print("Enter Radius of circle: ");
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();

        float c = circumference(r);
        float a = area(r);

        System.out.println("Circumference: " + c + " ; " + "Area: " + a)  ;

    }

    static float circumference(int radius) {
        return (float) (2 * 3.14 * radius);
    }

    static float area(int radius) {
        return (float) (3.14 * radius * radius);
    }

}
