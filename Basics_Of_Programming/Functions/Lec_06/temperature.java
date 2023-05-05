import java.util.Scanner;
public class temperature {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int min = scn.nextInt();
        int max = scn.nextInt();
        int step = scn.nextInt();

        for(int val=min; val<=max; val+=step){

            double C = ((double) 5 /9)*(val-32);
            System.out.println(C);
        }
    }
}
