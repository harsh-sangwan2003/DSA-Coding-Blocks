package April.Basics_Of_Programming.Arrays.HomeWork.RainWaterTrapping;
import java.util.Scanner;

public class Main3 {

    public static int rainWaterTrapping(int[] arr){

        int max_idx = 0;
        for(int i=1; i<arr.length; i++){

            if(arr[i]>arr[max_idx])
                max_idx = i;
        }

        int trapped_water = 0;
        int max_left = arr[0];
        for(int i=0; i<max_idx; i++){

            max_left = Math.max(max_left,arr[i]);
            trapped_water += Math.min(max_left,arr[max_idx])-arr[i];
        }

        int max_right = arr[arr.length-1];
        for(int i=arr.length-1; i>max_idx; i--){

            max_right = Math.max(max_right,arr[i]);
            trapped_water += Math.min(max_right,arr[max_idx])-arr[i];
        }

        return trapped_water;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();

        for(int t=1; t<=T; t++){

            int n = scn.nextInt();

            int[] arr = new int[n];
            for(int i=0; i<n; i++)
                arr[i] = scn.nextInt();

            int res = rainWaterTrapping(arr);
            System.out.println(res);
        }
    }
}
