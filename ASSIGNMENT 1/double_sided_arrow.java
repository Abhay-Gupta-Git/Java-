import java.util.Scanner;

public class double_sided_arrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int mid = n / 2 + 1;  
// MIRROR CONDITION
        int row = 1;
        
        while (row <= mid) {
            int space = mid - row;

            // SPACE
            int s = 0;
            while (s < space) {
                System.out.print("    ");
                s++;
            }

            // SIDHA
            int val = row;
            int c = 1;
            while (c <= row) {
                System.out.print(val + " ");
                val--;
                c++;
            }

            // GAP SPACING
            int midSpace = (row - 1) * 2 - 1;
            int ms = 0;
            while (ms < midSpace) {
                System.out.print("  ");
                ms++;
            }

            // ULTA
            if (row > 1) {
                int asc = 1;
                while (asc <= row) {
                    System.out.print(asc + " ");
                    asc++;
                }
            }

            System.out.println();
            row++;
        }

        
        int lowerRows = n / 2;
        int r = lowerRows;
        int rowLow = 1;
        while (rowLow <= lowerRows) {
            // EXTRA spaces
            int space = rowLow;
            int sp = 0;
            while (sp < space) {
                System.out.print("    ");
                sp++;
            }

            // SIDHA PRINT KARNA
            int val = r;
            int c = 1;
            while (c <= r) {
                System.out.print(val + " ");
                val--;
                c++;
            }

            // BICH KE SPACES
            int midSpace = (r - 1) * 2 - 1;
            int ms = 0;
            while (ms < midSpace) {
                System.out.print("  ");
                ms++;
            }

            // ULTA NUMBER PRINT KARNA H BSS]
            if (rowLow < lowerRows) {
                int asc = 1;
                while (asc <= r) {
                    System.out.print(asc + " ");
                    asc++;
                }
            }

            System.out.println();
            rowLow++;
            r--;
        }
    }
}