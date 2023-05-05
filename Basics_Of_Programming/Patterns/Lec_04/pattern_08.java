package March.Basic_Of_Programming.Patterns.Lec_04;
import java.util.Scanner;

public class pattern_08 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int row=1; row<=n; row++){

            for(int col=1; col<=n; col++){

                if(row==col || row+col==n+1)
                    System.out.print("*"+"  ");

                else
                    System.out.print("  ");
            }

            System.out.println();
        }
    }
}
