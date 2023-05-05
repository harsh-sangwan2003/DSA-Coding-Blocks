package April.Basics_Of_Programming.Arrays.Lec_09;

public class max_array {

    public static int Max(int[] arr){

        int max = arr[0];

        for(int val : arr)
        {
            if(val>max)
                max = val;
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};

        int max_val = Max(arr);
        System.out.println(max_val);
    }
}
