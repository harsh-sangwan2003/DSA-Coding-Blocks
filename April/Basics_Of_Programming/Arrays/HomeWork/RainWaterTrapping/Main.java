package April.Basics_Of_Programming.Arrays.HomeWork.RainWaterTrapping;
import java.util.Scanner;

public class Main {

    public static int rainWaterTrapping(int[] arr){

        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){

            max = Math.max(max,arr[i]);
            left[i] = max;
        }

        max = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--){

            max = Math.max(arr[i],max);
            right[i] = max;
        }

        int trappedWater = 0;
        for(int i=0; i<arr.length; i++){

            int min = Math.min(left[i],right[i]);

            if(min-arr[i]>0)
                trappedWater += min-arr[i];
        }

        return trappedWater;
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
