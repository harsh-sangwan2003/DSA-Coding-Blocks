import java.util.Scanner;

public class Main {

    public static boolean isValid(int[] ranks, int par, int mid){

        int count = 0;
        int time = 0;

        for(int i=0; i<ranks.length; i++){

            time = ranks[i];
            int j = 2;

            while(time<=mid){

                time += (ranks[i]*j);
                j++;
                count++;
            }

            if(count>=par) return true;
        }

        return false;

    }

    public static int minTime(int[] ranks, int p){

        int lo = 0;
        int hi = (int)1e9;
        int res = 0;

        while(lo<=hi){

            int mid = lo+(hi-lo)/2;

            if(isValid(ranks,p,mid))
            {
                res = mid;
                hi = mid-1;
            }

            else
                lo = mid+1;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int p = scn.nextInt();
        int n = scn.nextInt();

        int[] ranks = new int[n];
        for(int i=0; i<n; i++)
            ranks[i] = scn.nextInt();

        int res = minTime(ranks,p);
        System.out.println(res);
    }
}
