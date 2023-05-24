import java.util.Scanner;

public class first_occ {

    public static int firstOcc(int s, int[] arr, int tar) {

        if (s == arr.length)
            return -1;

        int sp = firstOcc(s + 1, arr, tar);
        if (arr[s] == tar)
            return s;

        return sp;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int tar = scn.nextInt();

        int res = firstOcc(0, arr, tar);
        System.out.println(res);

        scn.close();
    }
}