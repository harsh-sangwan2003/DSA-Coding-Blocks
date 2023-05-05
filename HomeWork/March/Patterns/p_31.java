package HomeWork.March.Patterns;
import java.util.Scanner;

public class p_31 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int count = n;

        for(int r=1; r<=n; r++){

            count = n;

            for(int col=1; col<=n; col++){

                if(r+col==n+1)
                    System.out.print("*"+" ");

                else
                    System.out.print(count+" ");

                count--;
            }

            System.out.println();
        }
    }
}
