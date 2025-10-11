import java.util.Scanner;

public class pattern_magic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while (row <= n) {
            // left stars
            int star = 1;
            while (star <= n - row + 1) {
                System.out.print("*");
                star++;
            }

            // spaces
            int space = 1;
            while (space <= 2 * row - 3) {
                System.out.print(" ");
                space++;
            }

            // right stars
            star = 1;
            while (star <= (row == 1 ? n - 1 : n - row + 1)) {
                System.out.print("*");
                star++;
            }

            System.out.println();
            row++;
        }

        row = 2;
        // 2ND PART
        while (row <= n) {
            // left stars
            int star = 1;
            while (star <= row) {
                System.out.print("*");
                star++;
            }

            // spaces
            int space = 1;
            while (space <= (n - row) * 2 - 1) {
                System.out.print(" ");
                space++;
            }

            // right stars
            star = 1;
            while (star <= (row == n ? row - 1 : row)) {
                System.out.print("*");
                star++;
            }

            System.out.println();
            row++;
        }
    }
}
