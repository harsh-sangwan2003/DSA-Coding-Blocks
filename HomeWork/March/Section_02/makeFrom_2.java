package HomeWork.March.Section_02;
import java.util.*;

public class makeFrom_2{

    public static void main(String ...args){

        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();

        long ans = 0;

        for(int i=1; i<=n; i++){

            long digit = scn.nextLong();
            ans = ans*10+digit;
        }

        System.out.println(ans);
    }
}