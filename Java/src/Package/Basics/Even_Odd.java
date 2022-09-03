package Package;
import java.util.Scanner;


public class Even_Odd {

    public static void main(String[] args) {

        System.out.println("Input");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if((n%2) == 0)
            System.out.println("It is an even number");
        else
            System.out.println("It is an odd number");

    }
}
