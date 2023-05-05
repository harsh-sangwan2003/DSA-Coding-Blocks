package April.Basics_Of_Programming.Arrays.Lec_09;

public class find_in_array {

    public static int Find(int[] arr, int target){

        for(int idx=0; idx<arr.length; idx++){

            if(arr[idx]==target)
                return idx;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};

        int idx = Find(arr,30);
        System.out.println(idx);
    }
}
