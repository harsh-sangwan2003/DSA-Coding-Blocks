import java.util.Scanner;
public class lower_upper {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        char ch = (char) scn.nextInt();

        if(ch>='a' && ch<='z')
            System.out.println("Chotta");

        else if(ch>='A' && ch<='Z')
        System.out.println("Bdaa");

        else
            System.out.println("Pta Nahi");
    }
}
