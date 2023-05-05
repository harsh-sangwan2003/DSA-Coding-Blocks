package March.Basic_Of_Programming.Patterns.Lec_03;
import java.util.*;

public class gcd {
    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);
        int first = scn.nextInt();
        int second = scn.nextInt();

        while(first%second!=0){

            int rem = first%second;
            first = second;
            second = rem;

        }

        System.out.println(second);
    }
}