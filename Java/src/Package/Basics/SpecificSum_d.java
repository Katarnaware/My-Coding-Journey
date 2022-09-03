// From GFG https://www.knowledgeboat.com/question/write-a-program-to-print-the-sum-of-negative-numbers-sum-of--40658903944004240

package Package;

import java.util.Scanner;

public class SpecificSum_d {
    public static void main(String[] args) {

        System.out.println("Enter Positive & Negative numbers: ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int neg = 0, epos = 0, opos = 0;

        while(num != 0) {
            if (num < 0)
                neg += num;

            else {
                if (num % 2 == 0)
                    epos += num;
                else
                    opos += num;
            }

            num = s.nextInt();
        }

        System.out.println("Negative No. Sum = " + neg);
        System.out.println("Positive Even No. Sum = " + epos);
        System.out.println("Positive Odd No. Sum = " + opos);


    }
}
