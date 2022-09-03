package Package;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {

    }

    private static void cone() {
        System.out.println("Enter radius of Circle of Cone: ");
        Scanner s = new Scanner(System.in);
        int radius = s.nextInt();
        System.out.println("Enter height of Cone:");
        float height = s.nextFloat();

        double v = Math.PI * radius * radius * height / 3;
        System.out.print("Volume of Cone is: " + v);
    }

    private  void prism() {
        System.out.println("Enter height and base of Triangle in Prism: ");
        Scanner s = new Scanner(System.in);
        float height = s.nextFloat();
        float base = s.nextFloat();
        System.out.println("Enter height of Prism");
        float H = s.nextFloat();

        float p = 1/2 * base * height * H;
        System.out.print("Volume of Triangle: " + p);
    }

    private static void cylinder() {
        System.out.println("Enter radius of circle of Cylinder: ");
        Scanner s = new Scanner(System.in);
        float r = s.nextFloat();
        System.out.println("Enter height of Cylinder: ");
        float h = s.nextFloat();

        float v = (float) (h * Math.PI * r * r);
        System.out.print("Volume of Cylinder: " + v);
    }

    private static void Pyramid() {
        System.out.println("Enter Length and width of base of the pyramid: ");
        Scanner s = new Scanner(System.in);
        float length = s.nextFloat();
        float width = s.nextFloat();
        System.out.println("Enter height of the Pyramid: ");
        float height = s.nextFloat();

        float v = length * width * height / 3;
        System.out.print("Perimeter of Square:" + v);
    }

    private static void sphere() {
        System.out.println("Enter radius of cone: ");
        Scanner s = new Scanner(System.in);
        float r = s.nextFloat();

        float p = (float) (4/3 * Math.PI * r * r * r);
        System.out.print("Perimeter of Isosceles Triangle: " + p);
    }
}
