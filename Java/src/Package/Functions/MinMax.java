package Package.Functions;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        System.out.println("Enter three numbers: ");
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();

        max(n1, n2, n3);
        min(n1, n2, n3);
    }

    static void max(int n1, int n2, int n3) {
        if(n1 > n2) {
            if(n1 > n3)
                System.out.println("Maximum: " + n1);
            else
                System.out.println("Maximum: " + n3);
        }
        else {
            if(n2 > n3)
                System.out.println("Maximum: " + n2);
            else
                System.out.println("Maximum: " + n3);
        }
    }


    static void min(int n1, int n2, int n3) {
        if(n1 < n2) {
            if(n1 < n3)
                System.out.println("Minimum: " + n1);
            else
                System.out.println("Minimum: " + n3);
        }
        else {
            if(n2 < n3)
                System.out.println("Minimum: " + n2);
            else
                System.out.println("Minimum: " + n3);
        }
    }


}
