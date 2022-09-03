package Package;
import java.util.Scanner;


public class SimpleInterest {

    public static void main(String[] args) {

        System.out.print("Enter the principal amount: ");
        Scanner p = new Scanner(System.in);
        long principal = p.nextLong();

        System.out.print("Enter the rate of interest: ");
        Scanner r = new Scanner(System.in);
        float rate = r.nextFloat();

        System.out.print("Enter the time period (in years): ");
        Scanner t = new Scanner(System.in);
        int time = t.nextInt();

        System.out.println("Simple Interest:" + " " + (principal*rate*time)/100);





    }
}
