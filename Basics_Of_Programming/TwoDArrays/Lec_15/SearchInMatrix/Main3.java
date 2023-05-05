import java.util.Scanner;

public class Main3 {

    public static boolean searchMatrix(int[][] arr, int tar){

        int r = 0;
        int c = arr[0].length-1;

        while(r<arr.length && c>=0){

            if(arr[r][c]==tar)
                return true;

            else if(arr[r][c]>tar)
                c--;

            else
                r++;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] mat = new int[n][m];
        for(int i=0; i<n; i++){

            for(int j=0; j<m; j++){

                mat[i][j] = scn.nextInt();
            }
        }

        int tar = scn.nextInt();

        boolean res = searchMatrix(mat,tar);
        System.out.println(res);
    }
}
