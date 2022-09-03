// from GFG   https://www.geeksforgeeks.org/find-average-first-n-natural-numbers/

package Package;

import java.util.Scanner;

public class AverageN {
    public static void main(String[] args) {

        System.out.println("Enter the Number: ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int sum = 0;

        for(int i = 1; i <= num; i++)
            sum = sum + i;

        float avg = (float) sum / num;
        System.out.println("Average: " + avg);

    }
}
