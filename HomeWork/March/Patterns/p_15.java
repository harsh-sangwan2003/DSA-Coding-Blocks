import java.util.Scanner;
public class p_15 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nst = n;
        int nsp = 0;

        for(int r=1; r<=2*n-1; r++){

            for(int csp=1; csp<=nsp; csp++)
                System.out.print("  ");

            for(int cst=1; cst<=nst; cst++)
                System.out.print("*"+" ");

            if(r<n)
            {
                nst--;
                nsp+=2;
            }

            else{
                nst++;
                nsp-=2;
            }

            System.out.println();
        }
    }
}
