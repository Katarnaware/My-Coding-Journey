package Package;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        System.out.print("Enter Year: ");
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();

        if(year%4 == 0 && year%100 == 0)
            if(year%400 == 0)
                System.out.println(year + " is a leap year");
            else
                System.out.println(year + " is not a leap year");

        else
            if(year%4 == 0)
                System.out.println(year + " is a leap year");
            else
                System.out.println(year + " is not a leap year");

    }
}
