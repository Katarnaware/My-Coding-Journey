package Package;

import java.util.Scanner;

public class FIV {
    public static void main(String[] args) {

        System.out.print("Enter the present value: ");
        Scanner s = new Scanner(System.in);
        int pv = s.nextInt();

        System.out.print("Enter Interest Rate: ");
        float i = s.nextFloat();
        System.out.print("Enter Time Period in Years: ");
        int t = s.nextInt();

        float fv =  (float) (pv * Math.pow((1 + i/100), t));
        System.out.println("Future Value: " + fv);
    }
}
