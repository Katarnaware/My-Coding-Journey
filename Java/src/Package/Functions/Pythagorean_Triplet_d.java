// From GFG https://www.geeksforgeeks.org/find-pythagorean-triplet-in-an-unsorted-array/

package Package.Functions;

public class Pythagorean_Triplet_d {
    public static void main(String[] args) {

        int num[] = {3, 1, 4, 6, 5};
        int num_size = num.length;
        isTriplet(num, num_size);
    }

    static void isTriplet(int[] arr, int n) {

        int temp1 = 0, temp2 = 0;

        for(int i = 0; i < n - 1; i++) {
            temp1 = arr[i] * arr[i];

            for(int j = i+1; j < n; j++) {
                temp2 = arr[j] * arr[j];

                for(int k = 0; k < n; k++) {
                    if(temp1+temp2 == arr[k] * arr[k] && (k != i) && (k != j))
                        System.out.println("Triplet: " + arr[i] + "," + arr[j] + "," + arr[k]);
                }
            }
        }

    }


}
