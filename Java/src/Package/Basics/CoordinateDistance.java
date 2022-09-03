// fROM GFG  https://www.geeksforgeeks.org/program-calculate-distance-two-points/

package Package;

import java.util.Scanner;

public class CoordinateDistance {
    public static void main(String[] args) {

        System.out.println("Enter first coordinate (x1, y1): ");
        Scanner s = new Scanner(System.in);
        double x1 = s.nextFloat();
        double y1 = s.nextFloat();

        System.out.println("Enter Second coordinate (x2, y2)");
        double x2 = s.nextFloat();
        double y2 = s.nextFloat();

        double temp = Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);
        double distance = Math.sqrt(temp);
        System.out.println("Distance: " + distance);
    }
}
