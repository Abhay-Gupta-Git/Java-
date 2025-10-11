import java.util.*;
public class mountain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = 2 * n - 3;
        int star = 1;
        for (int r = 1; r <= n; r++) {
            int num = 1;
            for (int i = 1; i <= star; i++) {
                System.out.print(num + "\t");
                num++;
            }

            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            if (r == n) {
                star--;
                num--;
            }

            num--;
            for (int k = 1; k <= star; k++) {
                System.out.print(num + "\t");
                num--;
            }

            star++;
            space -= 2;
            System.out.println();
        }
    }
}

