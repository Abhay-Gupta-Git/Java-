import java.util.*;

public class column_max_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[][] mat = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int colIndex = -1;

        for (int j = 0; j < N; j++) {
            int colSum = 0;
            for (int i = 0; i < N; i++) {
                colSum += mat[i][j];
            }
            if (colSum > maxSum) {
                maxSum = colSum;
                colIndex = j+1 ; 
            }
        }

        System.out.println(colIndex + " " + maxSum);
    }
}
