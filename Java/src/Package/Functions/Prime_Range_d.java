// https://www.geeksforgeeks.org/program-to-find-prime-numbers-between-given-interval/

package Package.Functions;

public class Prime_Range_d {
    public static void main(String[] args) {

        PrimeNum(0, 10);

    }

    static void PrimeNum(int n1, int n2) {

        if(n1 == n2)
            System.out.println("Error");
        else if (n1 > n2)
            System.out.println("Error: Number1 should be greater than Number2");
        else {

            for(int i = n1; i <= n2; i++) {

                int flag = 0;

                for(int j = 2; j < i/2; j++) {      // i/2 because we can find factors before it only and it saves time
                    if(i%j == 0) {
                        flag = 1;
                        break;
                    }
                }

                if(flag == 0)
                    System.out.print(i + ",");
            }
        }

    }




}

