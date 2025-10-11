import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("\t");
            }

            // sequence
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + "\t");
                num++;
            }

            // / decreasing sequence
            num -= 2; // before descending
            for (int j = 1; j < i; j++) {
                System.out.print(num + "\t");
                num--;
            }

            System.out.println();
        }
    }
}
