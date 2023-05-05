package HomeWork.March.Patterns;
import java.util.Scanner;

public class p_33 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nst = 1;
        int nsp = n-1;
        int count = n;

        for(int r=1; r<=n; r++){

            for(int csp=1; csp<=nsp; csp++)
                System.out.print("  ");

            count = n-r+1;
            for(int cst=1; cst<=nst; cst++){

                if(cst<=nst/2){

                    System.out.print(count+" ");
                    count++;
                }

                else if(cst==nst/2+1){

                    System.out.print(0+" ");
                    count-=1;
                }

                else{

                    System.out.print(count+" ");
                    count--;
                }
            }

            nst+=2;
            nsp--;

            System.out.println();
        }
    }
}
