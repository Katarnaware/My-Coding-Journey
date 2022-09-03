// From GFG  https://www.geeksforgeeks.org/c-program-find-gcd-hcf-two-numbers/

package Package;

import java.util.Scanner;

public class HCF_LCM_d {
    public static void main(String[] args) {

        System.out.print("Enter two numbers: ");
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();

        lcm(n1, n2);
        hcf(n1, n2);

    }


    static void hcf(int n1, int n2) {

        int common = 0;
        int n = Math.min(n1, n2);

        for(int i = n; i > 0; i--) {
            if(n1%i == 0 && n2%i == 0) {
                common = i;
                break;
            }
        }

        System.out.println("HCF: " + common);
    }



    static void lcm (int n1, int n2) {
        int common = 1;
        int n = Math.max(n1, n2);

        for(int i = 1; i <= n; i++) {
            if(n1%i == 0 || n2%i == 0)
                common = common * i;
        }

        System.out.println("LCM: " + common);
    }




}
