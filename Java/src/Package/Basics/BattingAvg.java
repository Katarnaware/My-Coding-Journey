// from GFG https://www.geeksforgeeks.org/find-the-batting-average-of-a-batsman/

package Package;

public class BattingAvg {
    public static void main(String[] args) {

        double runs = 10000, matches = 250, notout = 50;       //use scanner or this method!

        double battingavg = runs/(matches - notout);
        System.out.print("Batting Average: " + battingavg);
    }
}
