import java.util.Scanner;
public class p_02 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nst = 1;

        for(int r=1; r<=n; r++){

            for(int cst=1; cst<=nst; cst++)
                System.out.print("*"+" ");

            nst++;

            System.out.println();
        }
    }
}
