package Package;

import java.util.Scanner;

public class UserX {
    public static void main(String[] args) {

        int temp = 0;

        System.out.println("Positive Integer Inputs: ");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();

        while(input > 0) {

            if(input == 0)
                break;

            if(input > temp) {
                temp = input;
                input = s.nextInt();
            }
        }


        System.out.println("Greatest Integer is: " + temp);


    }
}
