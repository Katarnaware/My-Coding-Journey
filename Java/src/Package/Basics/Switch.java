package Package;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double x = s.nextDouble();
        System.out.print("Enter second number: ");
        double y = s.nextDouble();

        System.out.print("What operation?: ");
        char op = s.next().charAt(0);            // input char character

        switch (op) {
            case '+' -> System.out.println("Answer: " + (x + y));
            case '-' -> System.out.println("Answer:" + (x - y));
            case '*' -> System.out.println("Answer:" + (x * y));
            case '/' -> System.out.println("Answer:" + (x / y));
        }

    }
}

