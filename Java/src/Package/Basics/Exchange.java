package Package;

import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {

        System.out.print("Enter the value in rupees: ");
        Scanner s = new Scanner(System.in);
        double rupees = s.nextDouble();

        if(rupees <= 0) {
            System.out.println("Error");
            return;
        }
        else
        System.out.println("Dollars: " + rupees/78.13);    // consider the exchange rate to be 78.13


    }
}
