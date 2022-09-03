package Package;

import java.util.Scanner;

public class User0 {
    public static void main(String[] args) {

        int sum = 0, input;
        System.out.print("Give Integer Inputs: ");
        Scanner s = new Scanner(System.in);
        input = s.nextInt();

        while(input != 0) {
            sum = sum + input;
            input = s.nextInt();

        }

        System.out.println("Sum = " + sum);
    }
}
