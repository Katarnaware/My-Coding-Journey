// https://javatutoring.com/java-program-calculate-average-marks/

package Package;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {

        int sum = 0;

        System.out.print("Number of Subjects: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] marks = new int[n];
        System.out.println("Enter Marks: ");

        for(int i = 0; i < n; i++) {
            marks[i] = s.nextInt();
            sum = sum + marks[i];
        }

        float avg =  (float) sum / n;
        System.out.println("Average Marks: " + avg);
        
    }
}
