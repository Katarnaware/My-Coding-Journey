// From GFG  https://www.geeksforgeeks.org/java-program-to-display-numbers-and-sum-of-first-n-natural-numbers/

package Package;

import java.util.Scanner;

public class SumN {
    public static void main(String[] args) {

        int sum = 0;

        System.out.print("Enter N: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.print("First " + n + " Numbers: ");

        for(int i = 1; i <= n; i++) {
            sum = sum + i;
            System.out.print(i);

            if(i != n)
                System.out.print(",");
        }

        System.out.println();
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
    }
}
