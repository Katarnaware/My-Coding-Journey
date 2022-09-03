// From GFG  https://www.geeksforgeeks.org/java-program-for-compound-interest/

package Package;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Principal Amount: ");
        int p = s.nextInt();
        System.out.print("Time period in years: ");
        int t = s.nextInt();
        System.out.print("Rate of Interset: ");
        double r = s.nextDouble();

        double ci = p * Math.pow((1 + r/100), t);
        System.out.println("Compound Interest: " + ci);

    }
}
