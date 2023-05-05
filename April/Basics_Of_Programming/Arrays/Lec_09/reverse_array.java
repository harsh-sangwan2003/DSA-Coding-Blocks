package April.Basics_Of_Programming.Arrays.Lec_09;

public class reverse_array {

    public static void print(int[] arr){

        for(int val: arr)
            System.out.print(val+" ");

        System.out.println();
    }

    public static void reverseArray(int[] arr, int lo, int hi){

        while(lo<=hi){

            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;

            lo++;
            hi--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};

        print(arr);

        reverseArray(arr,0,arr.length-1);
        print(arr);
    }
}
