package April.Basics_Of_Programming.ArrayList.Lec_17;

import java.util.ArrayList;
import java.util.Scanner;

public class add_two_arrays {

    public static ArrayList<Integer> addition(int[] a, int[] b){

        int i = a.length-1;
        int j = b.length-1;
        int carry = 0;

        ArrayList<Integer> list = new ArrayList<>();

        while(i>=0 || j>=0){

            int val1 = i>=0?a[i]:0;
            int val2 = j>=0?b[j]:0;

            int sum = val1+val2+carry;
            int digit = sum%10;
            carry = sum/10;

            list.add(0,digit);

            i--;
            j--;
        }

        if(carry!=0)
            list.add(0,carry);

        return list;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int[] a = new int[n1];
        for(int i=0; i<n1; i++)
            a[i] = scn.nextInt();

        int n2 = scn.nextInt();
        int[] b = new int[n2];
        for(int i=0; i<n2; i++)
            b[i] = scn.nextInt();

        ArrayList<Integer> res = addition(a,b);
        System.out.println(res);
    }
}
