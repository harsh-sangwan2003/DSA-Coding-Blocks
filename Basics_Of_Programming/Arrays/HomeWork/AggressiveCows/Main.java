package April.Basics_Of_Programming.Arrays.HomeWork.AggressiveCows;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static boolean isPossible(int[] stalls, int c, int dis){

        int count = 1, lastCow = stalls[0];
        for(int i=1; i<stalls.length; i++){

            if(stalls[i]-lastCow>=dis){

                lastCow = stalls[i];
                count++;
            }
        }

        return count>=c;
    }
    public static int aggCows(int[] stalls, int c){

        Arrays.sort(stalls);

        int lo = 1;
        int hi = stalls[stalls.length-1] - stalls[0];
        int res = 0;

        while(lo<=hi){

            int mid = lo+(hi-lo)/2;

            if(isPossible(stalls,c,mid)){

                res = mid;
                lo = mid+1;
            }

            else{

                hi = mid-1;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int c = scn.nextInt();

        int[] stalls = new int[n];
        for(int i=0; i<n; i++)
            stalls[i] = scn.nextInt();

        int dist = aggCows(stalls,c);
        System.out.println(dist);
    }
}
