import java.util.*;

public class binaryToDecimal {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int mul = 1;
        int res = 0;

        while(n!=0){

            int ld = n%10;
            n/=10;

            res += ld*mul;
            mul*=2;
        }

        System.out.println(res);
    }
}