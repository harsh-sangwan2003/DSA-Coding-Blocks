package April.Basics_Of_Programming.Arrays.HomeWork;
import java.util.Scanner;

public class array_triplets {

    public static void arrayTriplets(int[] arr, int tar){

        for(int i=0; i<arr.length; i++){

            for(int j=i+1; j<arr.length; j++){

                for(int k=j+1; k<arr.length; k++){

                    if(arr[i]+arr[j]+arr[k]==tar){


                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();

        int tar = scn.nextInt();
        arrayTriplets(arr,tar);
    }
}
