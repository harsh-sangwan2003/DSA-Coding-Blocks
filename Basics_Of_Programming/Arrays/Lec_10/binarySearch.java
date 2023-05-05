import java.util.Scanner;

public class binarySearch {

    public static int binary(int[] arr, int tar){

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

        int idx = binary(arr,tar);
        System.out.println(idx);
    }
}
