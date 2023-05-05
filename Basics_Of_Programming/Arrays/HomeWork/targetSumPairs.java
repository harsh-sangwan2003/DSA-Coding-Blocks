package April.Basics_Of_Programming.Arrays.HomeWork;
import java.util.Scanner;
public class targetSumPairs {

    public static void targetPair(int[] arr, int tar){

        for(int i=0; i<arr.length; i++){

            for(int j=i+1; j<arr.length; j++){

                if(arr[i]+arr[j]==tar){

                    if (arr[i] > arr[j]) {
                        System.out.println(arr[j] + " and " + arr[i]);
                    } else {
                        System.out.println(arr[i] + " and " + arr[j]);
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

        targetPair(arr,tar);
    }
}
