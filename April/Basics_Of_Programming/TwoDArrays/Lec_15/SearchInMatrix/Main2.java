package April.Basics_Of_Programming.TwoDArrays.Lec_15.SearchInMatrix;
import java.util.Scanner;

public class Main2 {

    public static boolean searchMatrix(int[][] arr, int tar){

        for(int i=0; i<arr.length; i++){

            int s = 0;
            int e = arr[0].length-1;

            while(s<=e){

                int mid = s+(e-s)/2;

                if(arr[i][mid]==tar)
                    return true;

                else if(arr[i][mid]>tar)
                    e = mid-1;

                else
                    s = mid+1;
            }
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
