import java.util.Scanner;

public class Main1 {

    public static void tripletSum(int[] arr, int tar){

        for(int i=0; i<arr.length; i++){

            for(int j=i+1; j<arr.length; j++){

                for(int k=j+1; k<arr.length; k++){

                    if(arr[i]+arr[j]+arr[k]==tar){

                        if(arr[i]>arr[j] && arr[i]>arr[k]){

                            if(arr[j]>arr[k])
                                System.out.println(arr[k]+", "+arr[j]+" and "+arr[i]);

                            else
                                System.out.println(arr[j]+", "+arr[k]+" and "+arr[i]);
                        }

                        else if(arr[j]>arr[i] && arr[j]>arr[k]){

                            if(arr[i]>arr[k])
                                System.out.println(arr[k]+", "+arr[i]+" and "+arr[j]);

                            else
                                System.out.println(arr[i]+", "+arr[k]+" and "+arr[j]);
                        }

                        else{

                            if(arr[i]>arr[j])
                                System.out.println(arr[j]+", "+arr[i]+" and "+arr[k]);

                            else
                                System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
                        }
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

        int target = scn.nextInt();

        tripletSum(arr,target);
    }
}
