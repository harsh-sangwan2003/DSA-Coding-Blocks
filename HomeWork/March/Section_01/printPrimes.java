import java.util.*;

public class printPrimes {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i=2; i<=n; i++){

            int div = 2;
            boolean flag = true;

            while(div<=i/div){

                if(i%div==0){

                    flag = false;
                    break;
                }
                div++;
            }

            if(flag){

                System.out.println(i);
            }
        }
    }
}
