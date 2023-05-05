package April.Basics_Of_Programming.Arrays.HomeWork;
import java.util.Scanner;

public class find_Root {
    public static int findNthRoot(int n, int m) {
        int low = 1, high = m;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            int res = (int)Math.pow(mid,n);

            if (res == m) {
                return mid;
            } else if (res < m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int result = findNthRoot(n, m);
            System.out.println(result);
        }
    }
}
