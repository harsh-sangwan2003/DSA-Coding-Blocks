import java.util.Scanner;

public class Main {

    public static boolean isvalid(int[] arr, int m, int mid){

        int count = 1;
        int pageSum = 0;

        for(int i=0; i< arr.length; i++){

            if(pageSum+arr[i]<=mid)
                pageSum+=arr[i];

            else{

                count++;
                if(count>m || arr[i]>mid)
                    return false;

                pageSum = arr[i];
            }
        }

        return true;
    }

    public static int allocateBook(int[] arr, int m){

        int s = 0;
        int sum = 0;

        for(int val : arr)
            sum+=val;

        int e = sum;
        int res = -1;

        while(s<=e){

            int mid = s+(e-s)/2;

            if(isvalid(arr,m,mid))
            {
                res = mid;
                e = mid-1;
            }

            else{

                s = mid+1;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while(t-->0){

            int n = scn.nextInt();
            int m = scn.nextInt();

            int[] arr = new int[n];
            for(int i=0; i<n; i++)
                arr[i] = scn.nextInt();

            int res = allocateBook(arr,m);
            System.out.println(res);
        }
    }
}
