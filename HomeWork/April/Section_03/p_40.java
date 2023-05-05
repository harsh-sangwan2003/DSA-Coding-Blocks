package HomeWork.April.Section_03;
import java.util.Scanner;
public class p_40 {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nst = n-1;
        int nsp = -1;

        for(int r=1; r<2*n; r++){

            for(int cst=1; cst<=nst; cst++)
                System.out.print("*");

            for(int csp=1; csp<=nsp; csp++)
                System.out.print(" ");

            if(r==1 || r==2*n-1)
                System.out.print("*");

            for(int cst=1; cst<=nst; cst++)
                System.out.print("*");

            if(r==1)
                nst += 1;

            if(r<n){

                nst--;
                nsp+=2;
            }

            else if(r<2*n-2){

                nst++;
                nsp-=2;
            }

            else{

                nsp-=2;
            }

            System.out.println();
        }
    }
}
