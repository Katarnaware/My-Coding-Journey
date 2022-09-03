package Package;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        System.out.print("Enter the string: ");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();

        int half = name.length()/2;
        int temp = name.length();

        for(int i = 0; i < half; i++) {
            if (name.charAt(i) == name.charAt(temp-1))
                temp--;
            else
                System.out.println("It is not a Palindrome");
        }


        System.out.println("It is a Palindrome");

    }
}
