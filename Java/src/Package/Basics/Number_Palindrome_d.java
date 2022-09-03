// From GFG https://www.geeksforgeeks.org/check-if-a-number-is-palindrome/

package Package;

import java.util.Scanner;

public class Number_Palindrome_d {
    public static void main(String[] args) {

        System.out.print("Enter Number: ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int length = 0;

        int temp = num;
        while(temp%10 != 0) {
            temp = temp/10;
            length++;
        }

        int[] n = new int[length];

        for(int i = length - 1; i >= 0; i--, num = num/10)
            n[i] = num % 10;


        for(int i = 0; i < (length-1) / 2; i++) {
            if(n[i] != n[length-1]) {
                System.out.println("Not a Palindrome");
                return;
            }
        }


        System.out.println("It is a Palindrome");
    }


}

