import java.util.Scanner;
import java.util.Arrays;

public class Main2 {

    public static void tripletSum(int[] arr, int tar){

        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++){

            if(i>0 && arr[i]==arr[i-1])
                continue; //skip duplicates

            int j = i+1;
            int k = arr.length-1;

            while(j<k){

                int sum = arr[i]+arr[j]+arr[k];

                if(sum==tar){

                    System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
                    j++;
                    k--;

                    while(j<k && arr[j]==arr[j-1])
                        j++;

                    while(j<k && arr[k]==arr[k+1])
                        k--;
                }

                else if(sum<tar)
                    j++;

                else
                    k--;
            }

        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();

        int target = scn.nextInt();

        tripletSum(arr,target);
    }
}
