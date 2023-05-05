import java.util.*;

public class table1{

    public static void main(String ...args){

        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int temp = x;

        while(temp<=y){

            System.out.println(temp);
            temp+=x;
        }
    }
}