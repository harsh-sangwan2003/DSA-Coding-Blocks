package April.Basics_Of_Programming.Arrays.Lec_11;
import java.util.Arrays;
import java.util.Scanner;

public class selection_sort {

    public static void selectionSort(int[] arr){

        for(int i=0; i<arr.length-1; i++){

            int min_idx = i;
            for(int j=i+1; j<arr.length; j++){

                if(arr[j]<arr[min_idx])
                    min_idx = j;
            }

            if(min_idx!=i){

                int temp = arr[i];
                arr[i] = arr[min_idx];
                arr[min_idx] = temp;
            }
        }

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
