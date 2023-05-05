import java.util.Scanner;

public class kadane_algo {

    public static int max_sum(int[] arr){

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int val : arr){

            sum += val;
            max = Math.max(max,sum);

            if(sum<0)
                sum = 0;
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
