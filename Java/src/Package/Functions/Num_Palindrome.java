package Package.Functions;

import java.util.Scanner;

public class Num_Palindrome {
    public static void main(String[] args) {

        System.out.print("Enter number:");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if (isPalindrome(num))
            System.out.println("It is a Palindrome");
        else
            System.out.println("It is not a Palindrome");

    }


    static boolean isPalindrome(int num) {

        if (num < 10)
            return false;
        else {

            int count = 0, temp = num;
            while (temp % 10 != 0) {
                count++;
                temp = temp / 10;
            }

            int[] digits = new int[count];

            for (int i = 0; i < count; i++)
                digits[i] = num % 10;

            for (int j = 0; j < count / 2; j++) {
                if (digits[j] != digits[count - 1])
                    return false;
            }


                return true;
        }
    }




}

