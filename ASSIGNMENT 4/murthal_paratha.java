import java.util.*;

public class murthal_paratha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();       // total paranthas
        int L = sc.nextInt();       // number of cooks
        int[] r = new int[L];       // ranks
        for (int i = 0; i < L; i++) r[i] = sc.nextInt();

        System.out.println(minTime(r, P));
    }

    // Binary search for minimum time
    static int minTime(int[] r, int P) {
        int low = 0, high = 1_000_000; // a safe upper limit
        int ans = high;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (canCook(r, P, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    // Check if cooks can cook P paranthas in 't' minutes
    static boolean canCook(int[] r, int P, int t) {
        int count = 0;
        for (int rank : r) {
            int time = 0, k = 1;
            while (true) {
                time += rank * k;
                if (time > t) break;
                count++;
                k++;
            }
        }
        return count >= P;
    }
}
