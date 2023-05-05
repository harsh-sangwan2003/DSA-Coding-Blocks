package HomeWork.March.Section_02;
import java.util.*;

public class oddAndEven {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        for(int i=1; i<=num; i++){

            long n = scn.nextLong();
            long even = 0;
            long odd = 0;

            while(n!=0){

                long ld = n%10;
                n/=10;

                if(ld%2==0)
                    even+=ld;

                else
                    odd+=ld;
            }

            if(odd%3==0 || even%4==0)
                System.out.println("Yes");

            else
                System.out.println("No");
        }
    }
}