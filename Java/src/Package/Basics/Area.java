package Package;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        circle();
    }


    // making methods as private beacuse I want to use them in this class only
    // User should Standard system of units
     private static void circle() {
         System.out.println("Enter radius of Circle: ");
         Scanner s = new Scanner(System.in);
         int radius = s.nextInt();

         double area = Math.PI * radius * radius;
         System.out.print("Area of Circle is: " + area);
     }

    private static void triangle() {
        System.out.println("Enter length and breadth of Traingle: ");
        Scanner s = new Scanner(System.in);
        float height = s.nextFloat();
        float breadth = s.nextFloat();

        float area = (float) (0.5 * height * breadth);
        System.out.print("Area of Triangle: " + area);
    }

    private static void rectangle() {
        System.out.println("Enter length and breadth of Rectangle: ");
        Scanner s = new Scanner(System.in);
        float length = s.nextFloat();
        float breadth = s.nextFloat();

        float area = length * breadth;
        System.out.print("Area of Rectangle: " + area);
    }

    private static void isosceles() {
        System.out.println("Enter the length of same side of Isosceles Triangle: ");
        Scanner s = new Scanner(System.in);
        float side = s.nextFloat();
        System.out.println("Enter its breadth: ");
        float side2 = s.nextFloat();

        float area = (float) (side2/4 * Math.sqrt(4*side*side - side2*side2));
        System.out.print("Area of Triangle: " + area);
    }

    private static void parellelogram() {
        System.out.println("Enter height and base of Parellelogram: ");
        Scanner s = new Scanner(System.in);
        float height = s.nextFloat();
        float base = s.nextFloat();

        float area = height * base;
        System.out.print("Area of Parellelogram: " + area);

    }

    private static void rhombus() {
        System.out.println("Enter diagonal1 & diagonal2 OF Rhombus: ");
        Scanner s = new Scanner(System.in);
        float d1 = s.nextFloat();
        float d2 = s.nextFloat();

        float area = d1 * d2;
        System.out.print("Area of Rhombus: " + area);
    }

    private static void EquilateralTraingle() {
        System.out.println("Enter length of one of the side of Equilateral Traingle: ");
        Scanner s = new Scanner(System.in);
        float side = s.nextFloat();

        float area = side * side;
        System.out.print("Area of Equilateral Traingle: " + area);

    }
}
