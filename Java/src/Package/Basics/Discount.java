//  https://www.codevscolor.com/java-program-to-calculate-discount-price

package Package;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {

        System.out.println("Enter amount of product: ");
        Scanner s = new Scanner(System.in);
        int amount = s.nextInt();

        System.out.println("Enter discount percentage on product");
        float discount = s.nextFloat();

        float price = amount - (amount * discount/100);
        System.out.println("Final Price: " + price);

    }
}
