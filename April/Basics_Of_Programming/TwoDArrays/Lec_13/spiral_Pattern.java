package April.Basics_Of_Programming.TwoDArrays.Lec_13;
import java.util.Scanner;

public class spiral_Pattern {

    public static void spiralPattern(int[][] arr){

        int n = arr.length;
        int m = arr[0].length;

        int minRow = 0;
        int maxRow = n-1;
        int minCol = 0;
        int maxCol = m-1;
        int ne = (n)*(m);
        int count = 0;

        while(count<ne){

            for(int r=minRow; r<=maxRow && count<ne; r++){
                System.out.print(arr[r][minCol]+" ");
                count++;
            }
            minCol++;

            for(int c=minCol; c<=maxCol && count<ne; c++){
                System.out.print(arr[maxRow][c]+" ");
                count++;
            }
            maxRow--;

            for(int r=maxRow; r>=minRow && count<ne; r--){
                System.out.print(arr[r][maxCol]+" ");
                count++;
            }
            maxCol--;

            for(int c=maxCol; c>=minCol && count<ne; c--){
                System.out.print(arr[minRow][c]+" ");
                count++;
            }
            minRow++;
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){

            for(int j=0; j<m; j++){

                arr[i][j] = scn.nextInt();
            }
        }

        spiralPattern(arr);
    }
}
