// https://javatutoring.com/java-program-ncr-npr/

package Package;

import java.util.Scanner;

public class PermutationNCombination {
    public static void main(String[] args) {

        System.out.print("Enter n & r respectively: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();

        double ncr = combination(n, r);
        double npr = permutation(n, r);

        System.out.println("Value of " + n + "p" + r + ": " + npr);
        System.out.println("Value of " + n + "c" + r + ": " + ncr);

    }

    static long factorial(int num) {
        long fact = 1;

        while(num != 1) {
            fact = fact * num;
            num--;
        }
        return fact;
    }

    static double combination(int n, int r) {
        return (double) factorial(n) / (factorial(r) * factorial(n-r));
    }

    static double permutation(int n, int r) {
        return (double) factorial(n) / factorial(n-r);
    }
}