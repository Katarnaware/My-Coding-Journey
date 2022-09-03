package Package;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        long a = 0, b = 1, c = 1;

        System.out.print("How many numbers of fibonacci series to print?: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i = 0; i<n; i++) {
            c = a + b;
            a = b;
            b = c;

            System.out.print(c + "," + " ");

        }






        }


}
