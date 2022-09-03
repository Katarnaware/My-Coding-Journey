package Package;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {

        System.out.println("Input: ");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();

        System.out.print("Factors: ");

        for(int i = 1; i <= input; i++) {

            if(input % i == 0) {
                System.out.print(i + " ");
            }
        }


    }
}
