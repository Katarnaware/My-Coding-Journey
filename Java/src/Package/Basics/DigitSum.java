// From GFG https://www.geeksforgeeks.org/program-for-sum-of-the-digits-of-a-given-number/

package Package;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {

        System.out.print("Enter Number: ");
        Scanner s = new Scanner(System.in);
        long num = s.nextLong();
        int sum = 0;

        while(num%10 != 0) {
            sum += num%10;
            num = num/10;
        }

        System.out.println("Sum of Digits: " + sum);
    }
}
