import java.util.Scanner;

public class fahrenheitToCelsius {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int min = scn.nextInt();
        int max = scn.nextInt();
        int step = scn.nextInt();

        for(int val=min; val<=max; val+=step){

            int celsius = (5*(val-32))/9;
            System.out.println(val+"\t"+celsius);
        }

    }
}
