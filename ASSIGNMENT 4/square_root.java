import java.util.*;

public class square_root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        System.out.println(sqrt(x));
    }

    public static long sqrt(long x) {
        if (x == 0 || x == 1) return x;

        long lo = 0;
        long hi = x;
        long ans = 0;

        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            long sq = mid * mid;

            if (sq == x) {
                return mid;
            } else if (sq < x) {
                ans = mid;  
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return ans; 
    }
}
