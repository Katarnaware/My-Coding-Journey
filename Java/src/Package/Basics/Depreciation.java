// from GFG  https://www.geeksforgeeks.org/program-to-find-the-depreciation-of-value/
package Package;

import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {

        System.out.print("Enter current value: ");
        Scanner s = new Scanner(System.in);
        double v1 = s.nextInt();

        System.out.print("Enter the rate of depreciation: ");
        double r = s.nextFloat();
        System.out.print("Enter time period in years: ");
        double t = s.nextFloat();

        double v2 = v1 * Math.pow((1- r / 100), t);
        System.out.print("Depreciated Value: " + v2);

    }
}
