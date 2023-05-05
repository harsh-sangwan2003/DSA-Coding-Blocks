import java.util.Scanner;

public class pattern_13 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nst = 1;

        for(int row=1; row<2*n; row++){

            for(int cst=1; cst<=nst; cst++)
                System.out.print("*"+" ");

            System.out.println();

            if(row<n)
                nst++;

            else
                nst--;
        }
    }
}
