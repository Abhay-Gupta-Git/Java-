import java.util.*;

public class piyush_magic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); 
        int M = sc.nextInt(); 
        int K = sc.nextInt(); 
        int S = sc.nextInt(); 
        
        char[][] park = new char[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                park[i][j] = sc.next().charAt(0);
            }
        }

        boolean escaped = true;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (S < K) {
                    escaped = false;
                    break;
                }
                char cell = park[i][j];
                if (cell == '.') {
                    S -= 3;
                } 
                else if (cell == '*') {
                    S += 4;
                } 
                else if (cell == '#') {
                    break;
                }
                if (S < K) {
                    escaped = false;
                    break;
                }
            }
            if (!escaped) break;
        }

        if (escaped && S >= K) {
            System.out.println("Yes");
            System.out.println(S);
        } else {
            System.out.println("No");
        }
    }
}
