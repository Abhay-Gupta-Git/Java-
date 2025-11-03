
import java.util.*; 
public class array_spiral_clockwise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;
        int count = 0;
        int total = m * n;

        while (count < total) {

            // 1️⃣ Top row (left → right)
            for (int i = left; i <= right && count < total; i++) {
                System.out.print(arr[top][i] + ", ");
                count++;
            }
            top++;

            // 2️⃣ Right column (top → bottom)
            for (int i = top; i <= bottom && count < total; i++) {
                System.out.print(arr[i][right] + ", ");
                count++;
            }
            right--;

            // 3️⃣ Bottom row (right → left)
            for (int i = right; i >= left && count < total; i--) {
                System.out.print(arr[bottom][i] + ", ");
                count++;
            }
            bottom--;


            for (int i = bottom; i >= top && count < total; i--) {
                System.out.print(arr[i][left] + ", ");
                count++;
            }
            left++;
        }

        System.out.print("END");
    }
}

