
package Package;

import java.util.Scanner;

        public class Amstrong {
            public static void main(String[] args) {

                Scanner s = new Scanner(System.in);
                System.out.println("Input two numbers to find Amstrong: ");
                long x = s.nextInt();
                long y = s.nextInt();


                if (x>=0) {

                    for(long i = x; i <= y; i++) {

                        long temp = i, sum = 0, power = 0;

                        while(temp != 0) {
                            long v = temp % 10;
                            temp = temp/10;
                            power++;
                        }

                        temp = i;

                        while(temp != 0) {
                            long z = temp % 10;
                            z = (long) Math.pow(z, power);
                            sum = sum + z;
                            temp = temp/10;
                        }

                        if(i == sum)
                            System.out.print(i +" ");
                    }
                }

                else
                    System.out.println("Input number above 1");



            }
        }
