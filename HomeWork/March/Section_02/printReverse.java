package HomeWork.March.Section_02;
import java.util.*;

public class printReverse {

    public static long reverse(long num){

        long ans = 0;

        while(num!=0){

            long ld = num%10;
            num/=10;
            ans = ans*10+ld;
        }

        return (long)ans;
    }

    public static void main(String args[]) {
        // Your Code Here
        Scanner scn = new Scanner(System.in);
        long n = scn.nextInt();

        long res = reverse(n);
        System.out.println(res);
    }
}
