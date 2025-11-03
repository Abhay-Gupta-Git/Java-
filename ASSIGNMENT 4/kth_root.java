import java.util.*;

public class kth_root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long n = sc.nextLong();
            int k = sc.nextInt();
            System.out.println(kRoot(n, k));
        }
    }

    public static long kRoot(long n, int k) {
        long lo = 1;
        long hi = n;
        long ans = 0;
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            double pow = Math.pow(mid, k);

            if (pow <= n) {  
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }
}
