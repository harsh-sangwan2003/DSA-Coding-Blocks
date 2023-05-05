import java.util.*;

public class primeFactorization2{

    public static void main(String ...args){

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int div=2; div*div<=n; div++){

            int cnt = 1;
            while(n%div==0){

                if(cnt==1){
                    cnt++;
                    System.out.print(div+" ");
                }
                n/=div;
            }
        }

        if(n!=1)
            System.out.print(n);
    }
}