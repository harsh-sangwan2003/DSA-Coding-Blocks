import java.util.Arrays;
import java.util.Scanner;

public class insertion_sort {

    public static void insertionSort(int[] arr){

        for(int to_ins=1; to_ins<arr.length; to_ins++){

            int idx = to_ins-1;
            while(idx>=0 && arr[idx]>arr[idx+1]){

                int temp = arr[idx];
                arr[idx] = arr[idx+1];
                arr[idx+1] = temp;
                idx--;
            }

        }

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++)
            arr[i] = scn.nextInt();

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
