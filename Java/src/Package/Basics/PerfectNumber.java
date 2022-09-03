// From GFG https://www.geeksforgeeks.org/java-program-to-check-if-a-given-number-is-perfect-number/

package Package;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        System.out.print("Enter Number: ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int sum = 1;

        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                sum += i;
        }

        if (sum == num)
            System.out.println(num + " is a perfect number");
        else
            System.out.println(num + " is not perfect number");


    }
}