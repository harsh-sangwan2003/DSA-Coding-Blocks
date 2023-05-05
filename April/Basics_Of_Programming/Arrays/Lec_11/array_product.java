package April.Basics_Of_Programming.Arrays.Lec_11;
import java.util.Scanner;

public class array_product {

    public static void arrayProduct(int[] arr){

        long[] left = new long[arr.length];
        left[0] = arr[0];

        long[] right = new long[arr.length];
        right[arr.length-1] = arr[arr.length-1];

        for(int i=1; i<arr.length; i++)
            left[i] = arr[i]*left[i-1];

        for(int i=arr.length-2; i>=0; i--)
            right[i] = arr[i]*right[i+1];

        for(int i=0; i<arr.length; i++){

            if(i==0)
                System.out.print(right[i+1]+" ");

            else if(i==arr.length-1)
                System.out.print(left[i-1]+" ");

            else
                System.out.print(left[i-1]*right[i+1]+" ");
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();

        arrayProduct(arr);
    }
}
