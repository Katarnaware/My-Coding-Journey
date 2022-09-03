package Package;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {


    }

    private static void circle() {
        System.out.println("Enter radius of circle: ");
        Scanner s = new Scanner(System.in);
        int radius = s.nextInt();

        double p = 2 * Math.PI * radius;
        System.out.print("Perimeter of Circle is: " + p);
    }

    private  void triangle() {
        System.out.println("Enter the sides of Traingle: ");
        Scanner s = new Scanner(System.in);
        float side1 = s.nextFloat();
        float side2 = s.nextFloat();
        float side3 = s.nextFloat();

        float p = side1 + side2 +side3;
        System.out.print("Perimeter of Triangle: " + p);
    }

    private static void rectangle() {
        System.out.println("Enter length and breadth of Rectangle: ");
        Scanner s = new Scanner(System.in);
        float length = s.nextFloat();
        float breadth = s.nextFloat();

        float p = 2 * (length + breadth);
        System.out.print("Perimeter of Triangle: " + p);
    }

    private static void square() {
        System.out.println("Enter one side of Square: ");
        Scanner s = new Scanner(System.in);
        float side = s.nextFloat();

        float p = 4 * side;
        System.out.print("Perimeter of Square:");
    }

    private static void isosceles() {
        System.out.println("Enter length of same side of Traingle: ");
        Scanner s = new Scanner(System.in);
        float side1 = s.nextFloat();
        System.out.println("Enter Breadth: ");
        float side2 = s.nextFloat();

        float p = side1 + side1 + side2;
        System.out.print("Perimeter of Isosceles Triangle: " + p);
    }

    private static void parellelogram() {
        System.out.println("Enter length and breadth of Parallelogram: ");
        Scanner s = new Scanner(System.in);
        float length = s.nextFloat();
        float breadth = s.nextFloat();

        float p =  2 * (length + breadth);
        System.out.print("Perimeter of Parellelogram: " + p);
    }

    private static void rhombus() {
        System.out.println("Enter one of the side of Rhombus: ");
        Scanner s = new Scanner(System.in);
        float side = s.nextFloat();

        float p = 4 * side;
        System.out.print("Perimeter of Rhombus: " + p);
    }

    private static void EquilateralTraingle() {
        System.out.println("Enter side of Equilateral Traingle: ");
        Scanner s = new Scanner(System.in);
        float side = s.nextFloat();

        float p = 3 * side;
        System.out.print("Perimeter of Equilateral Traingle: " + p);
    }

}
