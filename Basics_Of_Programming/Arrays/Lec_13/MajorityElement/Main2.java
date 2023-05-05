import java.util.Scanner;

public class Main2 {

    public static int majorityEle(int[] arr){

        int ans = arr[0];
        int count = 1;

        for(int i=1; i<arr.length; i++){

            if(ans==arr[i])
                count++;

            else
                count--;

            if(count<0)
            {
                count = 1;
                ans = arr[i];
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();

        int res = majorityEle(arr);
        System.out.println(res);
    }
}
