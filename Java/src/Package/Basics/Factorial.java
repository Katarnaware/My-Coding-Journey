package Package;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        System.out.print("Enter the number: ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int temp = 1;

        if(num >= 1)
        {
            while(num != 1) {
                temp = num * temp;
                num--;
            }

            System.out.println("Its Factorial: " + temp);





        }
        else
            System.out.println("Provide a positive integer greater than 0");
    }
}
