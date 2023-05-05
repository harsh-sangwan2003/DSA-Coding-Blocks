package HomeWork.March.Section_02;
import java.util.*;

public class countDigits {
    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();

        int cnt = 0;
        while(x!=0){

            int ld = x%10;
            x/=10;

            if(ld==y)
                cnt++;
        }

        System.out.println(cnt);
    }
}