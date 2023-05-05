import java.util.Scanner;

public class buy_sell_stock {

    public static int sellStock(int[] arr){

        int maxP = 0;
        int min = arr[0];

        for(int i=0; i<arr.length; i++){

            maxP = Math.max(maxP,arr[i]-min);

            min = Math.min(min,arr[i]);
        }

        return maxP;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();

        int ans = sellStock(arr);
        System.out.println(ans);
    }
}
