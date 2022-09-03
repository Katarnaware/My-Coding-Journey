package Package;

import java.util.Scanner;

    public class VowelConstant_d {
        public static void main(String[] args) {

            System.out.print("Enter the Character: ");
            Scanner s = new Scanner(System.in);
            char c = s.next().charAt(0);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                System.out.println("It is a vowel");
            else
                System.out.println("It is a constant");


        }

    }


