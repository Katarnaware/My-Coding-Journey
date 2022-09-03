package Package.Functions;


import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {

        System.out.println("Enter Age: ");
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();

        voting_eligibility(age);

    }

    static void voting_eligibility(int age) {
        if(age >= 18)
            System.out.println("Eligible to vote");
        else
            System.out.println("Not Eligible");
    }
}
