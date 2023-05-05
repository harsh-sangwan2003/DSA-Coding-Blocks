import java.util.Scanner;
public class rotate_num2 {

    public static int NOD(int num){

        int nod = 0;

        while(num!=0){

            num/=10;
            nod++;
        }

        return nod;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int k = scn.nextInt();

        int nod = NOD(num);

        if(k<0)
            k+=nod;

        k%=nod;

        int div = (int)Math.pow(10,k);
        int a = num%div;
        int b = num/div;

        int res = a*(int)Math.pow(10,nod-k)+b;

        System.out.println(res);
    }
}
