import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();

        while(T-->0){

            int n = scn.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n; i++)
                arr[i] = scn.nextInt();

            int tar = scn.nextInt();

            Arrays.sort(arr);

            int lo = 0;
            int hi = arr.length-1;
            int min_diff = Integer.MAX_VALUE;
            int val1 = -1, val2 = -1;

            while(lo<hi){

                int diff = Math.abs(arr[hi]-arr[lo]);
                int sum = arr[lo]+arr[hi];

                if(sum==tar && diff<min_diff){

                    val1 = arr[lo];
                    val2 = arr[hi];

                    lo++;
                    hi--;
                }

                else if(sum<tar)
                    lo++;

                else
                    hi--;

            }

            System.out.println("Deepak should buy roses whose prices are " + val1 + " and " + val2 + ".");
        }
    }
}
