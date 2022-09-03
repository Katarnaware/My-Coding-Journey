package Package;

import java.util.Scanner;

public class SubtractProductAndSum {
    public static void main(String[] args) {

        int mul = 1, add = 0;

        System.out.println("Input: ");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();

        while(input != 0) {
            int z = input % 10;
            mul = mul * z;
            add = add + z;
            input = input / 10;
        }

        int sub = mul - add;
        System.out.print("Output: " + sub);
    }
}
