// from GFG   https://www.geeksforgeeks.org/program-to-calculate-electricity-bill/

package Package;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        System.out.println("Enter the units consumed: ");
        Scanner s = new Scanner(System.in);
        int units = s.nextInt();
        int price = 0;

        if(units >= 1 && units <= 100)
           price = units * 10;

        else if(units >= 101 && units <= 200) {
            units = 200 - units;
            price = (units * 15) + 1000;        // Since 1-100 it is 10/unit, so 100*10 = 1000
        }

        else if(units >= 201 && units <= 300) {
            units = 300 - units;
            price = (units * 20) + 2500;        // 1-100 = 1000rs  +  101-200 = 1500rs ; Total = 2500rs
        }

        else if(units > 300)
            price = units * 25;

        else
            System.out.println("Error");

        System.out.println("Bill Amount: " + price);


    }
}
