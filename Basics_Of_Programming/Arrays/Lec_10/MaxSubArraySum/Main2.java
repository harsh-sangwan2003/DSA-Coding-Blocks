package April.Basics_Of_Programming.Arrays.Lec_10.MaxSubArraySum;
import java.util.Scanner;

public class Main2 {

    public static int max_sum(int[] arr){

        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){

            int sum = 0;
            for(int j=i; j<arr.length; j++){

                sum+=arr[j];
                max = Math.max(max,sum);
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();

        int ans = max_sum(arr);
        System.out.println(ans);
    }
}
