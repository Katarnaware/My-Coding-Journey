package Package;

public class CGPA {
    private static final int n = 5;      // change it as per the number of subjects

    public static void main(String[] args) {

        int[] marks = {90, 80, 70, 80, 90};    //marks per subject
        int[] grades = new int[n];
        float GradeSum = 0;

        for(int i = 0; i < 5; i++)
            grades[i] = marks[i] / 10;

        for(int i = 0; i<n; i++)
            GradeSum = GradeSum + grades[i];

        float cgpa = GradeSum / n;
        System.out.print("CGPA: " + cgpa);

    }
}
