package HomeWork.April.Section_03;
import java.util.Scanner;

public class p_38 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nst = 1;

        for(int r=1; r<=n; r++){

            for(int cst=1; cst<=nst; cst++){

                if(cst==1 || cst==nst)
                    System.out.print(r+" ");

                else
                    System.out.print(0+" ");
            }

            nst++;
            System.out.println();
        }
    }
}
