import java.util.*;

public class printSeries{

    public static void main(String ...args){

        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int i=1;
        int cnt = 1;

        while(i<=n1){

            int temp = (3*cnt)+2;

            if(temp%n2!=0){

                System.out.println(temp);
                i++;
            }

            cnt++;

        }
    }
}