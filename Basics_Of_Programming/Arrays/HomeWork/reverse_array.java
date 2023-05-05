import java.util.Scanner;

public class reverse_array {

    public static void reverseArray(int[] arr, int lo, int hi){

        while(lo<=hi){

            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;

            lo++;
            hi--;
        }
    }

    public static void printArray(int[] arr){

        for(int val : arr)
            System.out.println(val);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++)
            arr[i] = scn.nextInt();

        reverseArray(arr,0,n-1);
        printArray(arr);
    }
}
