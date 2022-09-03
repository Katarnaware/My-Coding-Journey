// From GFG  https://www.geeksforgeeks.org/java-program-to-check-if-a-number-is-prime-or-not/

package Package.Functions;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        System.out.print("Enter the number: ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        if(isPrime(num))
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is a Non-Prime Number");


    }


    static boolean isPrime(int n) {

        if(n <= 1)
            return false;

        for(int i = 2; i <= n-1; i++) {
            if(n%i == 0)
                return false;
        }

        return true;
    }



}
