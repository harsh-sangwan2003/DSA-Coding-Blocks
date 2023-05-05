package HomeWork.March.Section_02;
import java.util.*;

public class chewbacca {
    public static void main(String[] args) {
        // Your Code Here
        Scanner scn = new Scanner(System.in);
        long num = scn.nextLong();
        long mul = 1;
        long res = 0;

        while(num!=0){

            long ld = num%10;

            if(ld>9-ld)
            {
                if(ld==9 && num/10==0)
                    res += ld*mul;

                else
                    res += (9-ld)*mul;
            }

            else
                res += ld*mul;

            num/=10;
            mul*=10;

        }

        System.out.println(res);
    }
}
