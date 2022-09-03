package Package.Functions;

import java.util.Scanner;

public class Grade_d {
    public static void main(String[] args) {

        StudentGrade();
    }


    static int StudentGrade() {

        System.out.print("Enter number of subjects: ");
        Scanner s = new Scanner(System.in);
        int sub = s.nextInt();

        if(sub <= 0)
            return 1;
        else {

            int[] marks = new int[sub];
            int[] credits = new int[sub];
            int points = 0;

            for(int i = 0; i < sub; i++) {
                System.out.print("Subject " + (i+1) + " Marks: ");
                marks[i] = s.nextInt();
                System.out.print("Subject " + (i+1) + " Credits: ");
                credits[i] = s.nextInt();
                System.out.println();
            }

            for(int i = 0; i < sub; i++) {

                if(marks[i] >= 85 && marks[i] <= 100) {
                    System.out.println("Subject " + (i + 1) + " Grade: AA");
                    points += credits[i] * 10;
                }
                else if(marks[i] >= 75 && marks[i] <= 84) {
                    System.out.println("Subject " + (i + 1) + " Grade: AB");
                    points += credits[i] * 9;
                }
                else if(marks[i] >= 65 && marks[i] <= 74) {
                    System.out.println("Subject " + (i + 1) + " Grade: BB");
                    points += credits[i] * 8;
                }
                else if(marks[i] >= 55 && marks[i] <= 64) {
                    System.out.println("Subject " + (i + 1) + " Grade: BC");
                    points += credits[i] * 7;
                }
                else if(marks[i] >= 45 && marks[i] <= 54) {
                    System.out.println("Subject " + (i + 1) + " Grade: CC");
                    points += credits[i] * 6;
                }
                else if(marks[i] >= 35 && marks[i] <= 44) {
                    System.out.println("Subject " + (i + 1) + " Grade: CD");
                    points += credits[i] * 5;
                }
                else if(marks[i] < 35)
                    System.out.println("Subject " + (i + 1) + " Grade: FF");
                else
                    System.out.println("Error");
            }

            System.out.println();
            System.out.println("Total Points: " + points + " /200");
            float SPI =  (float) points / 20;
            System.out.println("Pointer: " + SPI);
            return 0;
        }


    }




}
