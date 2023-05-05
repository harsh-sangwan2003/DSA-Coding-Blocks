import java.util.Scanner;
public class rotate_num {

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

        k = k%nod;

        for(int r=1; r<=k; r++){

            int d = num%10;
            num/=10;

            int mult = (int)Math.pow(10,nod-1);
            num = d*mult+num;

        }

        System.out.println(num);
    }
}
