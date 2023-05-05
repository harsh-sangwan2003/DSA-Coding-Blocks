package April.Basics_Of_Programming.TwoDArrays.Lec_15.SearchInMatrix;
import java.util.Scanner;

public class Main {

    public static boolean searchMatrix(int[][] arr, int tar){

        for(int i=0; i<arr.length; i++){

            for(int j=0; j<arr[0].length; j++){

                if(arr[i][j]==tar)
                    return true;
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
