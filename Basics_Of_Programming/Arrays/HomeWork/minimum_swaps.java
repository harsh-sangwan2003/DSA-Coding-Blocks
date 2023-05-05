package April.Basics_Of_Programming.Arrays.HomeWork;
import java.util.Scanner;

public class minimum_swaps {

    public static int minSwaps(int[] arr){

        int swaps = 0;

        for(int i=0; i<arr.length-1; i++){

            int min_idx = i;
            for(int j=i+1; j<arr.length; j++){

                if(arr[j]<arr[min_idx])
                    min_idx = j;
            }

            if(min_idx!=i)
            {
                int temp = arr[i];
                arr[i] = arr[min_idx];
                arr[min_idx] = temp;
                swaps++;
            }
        }

        return swaps;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++)
            arr[i] = scn.nextInt();

        int ans = minSwaps(arr);
        System.out.println(ans);
    }
}
