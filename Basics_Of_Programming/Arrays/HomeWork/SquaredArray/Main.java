import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void printArray(int[] arr){

        for(int val : arr)
            System.out.print(val+" ");
    }
    public static void squaredArray(int[] arr){

        for(int i=0; i<arr.length; i++)
            arr[i]*=arr[i];

        Arrays.sort(arr);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();

        squaredArray(arr);
        printArray(arr);
    }
}
