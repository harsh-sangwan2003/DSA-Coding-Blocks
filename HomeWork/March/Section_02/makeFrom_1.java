import java.util.*;

public class makeFrom_1{

    public static void main(String ...args){

        Scanner scn = new Scanner(System.in);

        long n = scn.nextLong();

        long res = 0;
        long mul = 1;

        for(int i=1; i<=n; i++){

            long digit = scn.nextLong();
            res = digit*mul + res;
            mul*=10;
        }

        System.out.println(res);

    }
}