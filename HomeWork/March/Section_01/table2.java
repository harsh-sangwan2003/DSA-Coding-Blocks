import java.util.*;

public class table2{

    public static void main(String ...args){

        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();

        int count = 1;

        while(count<=y){

            System.out.println(x*count);
            count++;
        }
    }
}