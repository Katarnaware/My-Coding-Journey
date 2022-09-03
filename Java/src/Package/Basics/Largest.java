package Package;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        long x = s.nextLong();
        System.out.print("Enter second number: ");
        long y = s.nextLong();

        if(x>y)
            System.out.println("Greater is: " + x);
        else if(x == y)
            System.out.println("Both are same numbers:");
        else
            System.out.println("Greater is: " + y);

    }
}
