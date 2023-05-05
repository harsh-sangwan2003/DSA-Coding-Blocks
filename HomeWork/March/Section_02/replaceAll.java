package HomeWork.March.Section_02;
import java.util.*;

public class replaceAll {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        long num = scn.nextLong();

        long mul = 1;
        long res = 0;

        if(num==0)
        {
            System.out.println(5);
            System.exit(0);
        }

        while(num!=0){

            long ld = num%10;

            if(ld!=0)
                res = ld*mul+res;

            else
                res = 5*mul+res;

            num/=10;
            mul*=10;
        }

        System.out.println(res);
    }
}