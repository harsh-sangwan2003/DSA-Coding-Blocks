package April.Basics_Of_Programming.Arrays.Lec_11;
import java.util.Scanner;

public class binary_search {

    public static int binarySearch(int[] arr, int tar){

        int lo = 0;
        int hi = arr.length-1;

        while(lo<=hi){

            int mid = lo+(hi-lo)/2;

            if(arr[mid]==tar)
                return mid;

            else if(arr[mid]<tar)
                lo = mid+1;

            else
                hi = mid-1;
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();

        int tar = scn.nextInt();

        int idx = binarySearch(arr,tar);
        System.out.println(idx);
    }
}
