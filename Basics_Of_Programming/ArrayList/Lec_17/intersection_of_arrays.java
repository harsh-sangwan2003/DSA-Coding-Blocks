package Basics_Of_Programming.ArrayList.Lec_17;

import java.util.ArrayList;
import java.util.Scanner;

public class intersection_of_arrays {

    static Scanner scn = new Scanner(System.in);
    public static void input(int[] arr){

        for(int i=0; i<arr.length; i++)
            arr[i] = scn.nextInt();
    }

    public static ArrayList<Integer> intersection(int[] a, int[] b){

        int i = 0;
        int j = 0;

        ArrayList<Integer> list = new ArrayList<>();

        while(i<a.length && j<b.length){

            if(a[i]==b[j])
            {
                list.add(a[i]);
                i++;
                j++;
            }

            else if(a[i]<b[j])
                i++;

            else
                j++;
        }

        return list;
    }

    public static void main(String[] args) {


        int n1 = scn.nextInt();
        int[] a = new int[n1];
        input(a);

        int n2 = scn.nextInt();
        int[] b = new int[n2];
        input(b);

        ArrayList<Integer> res = intersection(a,b);
        System.out.println(res);
    }
}
