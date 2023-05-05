package April.Basics_Of_Programming.Arrays.HomeWork;
import java.util.Scanner;

public class calculate_the_sum {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();

        int Q = scn.nextInt();
        while(Q-->0){

            int x = scn.nextInt();
            int[] temp = new int[arr.length];

            for(int i=0; i<n; i++){

                int idx = (i-x)%arr.length;

                if(idx<0)
                    idx+=arr.length;

                temp[i] = arr[i]+arr[idx];
            }
            arr = temp;
        }

        int sum = 0;
        for(int val : arr)
            sum+=val;

        System.out.println(sum%(int)(1e9+7));
    }
}
