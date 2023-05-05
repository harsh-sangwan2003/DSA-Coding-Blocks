import java.util.Scanner;

public class subArraySum {

    public static void SubArraySum(int[] arr){

        for(int i=0; i<arr.length; i++){

            for(int j=i; j<arr.length; j++){

                int sum = 0;
                for(int k=i; k<=j; k++){

                    sum+=arr[k];
                    System.out.print(arr[k]+" ");
                }

                System.out.println("-> "+sum);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();

        SubArraySum(arr);
    }
}
