package Package;

import java.util.Scanner;

public class SurfaceArea {
    public static void main(String[] args) {

        cube();

    }

    private static void Cylinder() {
        System.out.println("Enter the radius of the circle in Cylinder: ");
        Scanner s = new Scanner(System.in);
        float r = s.nextFloat();
        System.out.println("Enter the height of the cylinder: ");
        float h = s.nextFloat();

        float sa = (float) (2 * Math.PI * r * h);
        System.out.println("Curved Surface Area of Cylinder is: " + sa);
    }

    private static void cube() {
        System.out.println("Enter the side of one square of the Cube: ");
        Scanner s = new Scanner(System.in);
        float side = s.nextFloat();

        float sa = 6 * side * side;
        System.out.println("Surface Area of Cube: " + sa);
    }
}
