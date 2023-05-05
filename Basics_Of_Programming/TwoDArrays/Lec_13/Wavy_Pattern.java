import java.util.Scanner;

public class Wavy_Pattern {

    public static void printWavy(int[][] arr){

        for(int col=0; col<arr[0].length; col++){

            if(col%2==0){

                for(int row=0; row<arr.length; row++){

                    System.out.print(arr[row][col]+", ");
                }
            }

            else{

                for(int row=arr.length-1; row>=0; row--){

                    System.out.print(arr[row][col]+" ");
                }
            }
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

        printWavy(arr);
    }
}
