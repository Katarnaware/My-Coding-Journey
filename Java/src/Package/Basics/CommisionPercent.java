// https://btechgeeks.com/java-program-to-calculate-commission-percentage/

package Package;

import java.util.Scanner;

public class CommisionPercent {
    public static void main(String[] args) {

        System.out.println("Enter the amount: ");
        Scanner s = new Scanner(System.in);
        int amount = s.nextInt();

        System.out.println("Enter your commision amount: ");
        int commision = s.nextInt();

        double percent = (double) (commision * 100) / amount;
        System.out.println("Commision Percentage: " + percent + "%");


    }
}
