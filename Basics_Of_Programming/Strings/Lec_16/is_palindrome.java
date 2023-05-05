package April.Basics_Of_Programming.Strings.Lec_15;
import java.util.Scanner;

public class is_palindrome {

    public static boolean isPalindrome(String str){

        int lo = 0;
        int hi = str.length()-1;

        while(lo<=hi){

            char first = str.charAt(lo);
            char last = str.charAt(hi);

            if(first!=last)
                return false;

            lo++;
            hi--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        System.out.println(isPalindrome(str));
    }
}
