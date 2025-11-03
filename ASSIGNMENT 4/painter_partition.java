import java.util.*;
public class painter_partition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt(); // number of painters
        int N = sc.nextInt(); // number of boards
        int[] boards = new int[N];

        for (int i = 0; i < N; i++) boards[i] = sc.nextInt();

        System.out.println(minTime(boards, K));
    }

    static int minTime(int[] boards, int K) {
        int maxBoard = 0, sum = 0;
        for (int b : boards) {
            maxBoard = Math.max(maxBoard, b);
            sum += b;
        }

        int low = maxBoard; // at least one painter has to paint largest board
        int high = sum;     // at most one painter paints everything
        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(boards, K, mid)) {
                ans = mid;       // possible, try smaller
                high = mid - 1;
            } else {
                low = mid + 1;   // not possible, increase time
            }
        }

        return ans;
    }

    // Check if it's possible to paint all boards with given maxTime
    static boolean isPossible(int[] boards, int K, int maxTime) {
        int painters = 1;
        int time = 0;

        for (int b : boards) {
            if (time + b <= maxTime) {
                time += b;
            } else {
                painters++;
                time = b;
            }
        }

        return painters <= K;
    }
}


