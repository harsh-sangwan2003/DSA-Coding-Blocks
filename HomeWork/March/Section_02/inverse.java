import java.util.*;

public class inverse {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        long num = scn.nextLong();

        long pos = 1;
        long res = 0;

        while(num!=0){

            long ld = num%10;
            num/=10;

            res += pos*(long)Math.pow(10,ld-1);
            pos++;
        }

        System.out.println(res);
    }
}