import java.util.Scanner;

public class p_32 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int count = 1;
        int nst=1;

        for(int r=1; r<=2*n-1; r++){

            for(int cst=1; cst<=nst; cst++){

                if(cst%2==0)
                    System.out.print("*"+" ");

                else
                    System.out.print(count+" ");

            }

            if(r<n){

                nst+=2;
                count++;
            }

            else{

                nst-=2;
                count--;
            }

            System.out.println();
        }
    }
}
