import java.util.*;

public class mummy_speech {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        
        // Input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        boolean game = true;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { 
                if (mat[i][j] != 0) {
                    game = false;
                    break;
                }
            }
        }

        System.out.println(game);
    }
}
