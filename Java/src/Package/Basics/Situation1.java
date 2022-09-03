package Package;

public class Situation1 {
    public static void main(String[] args) {

        int days = 31, num = 0;

        while(days != 0) {
            if(days%2 == 0)
                num++;

            days--;
        }

        System.out.println("Vipul can go out " + num + " days");
    }
}
