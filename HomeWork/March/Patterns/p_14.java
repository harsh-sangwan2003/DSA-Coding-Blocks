package HomeWork.March.Patterns;
import java.util.Scanner;
public class p_14 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nst = 1;
        int nsp = n-1;

        for(int r=1; r<=2*n-1; r++){

            for(int csp=1; csp<=nsp; csp++)
                System.out.print("  ");

            for(int cst=1; cst<=nst; cst++)
                System.out.print("*"+" ");

            if(r<n)
            {
                nst+=1;
                nsp--;
            }

            else{
                nst-=1;
                nsp++;
            }

            System.out.println();
        }
    }
}
