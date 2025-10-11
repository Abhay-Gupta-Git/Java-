import java.util.Scanner;

public class zeros_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int row = 1;
        while (row <= N) {
            int value = 1;
            while (value <= row) {

                if (value == 1 || value == row) {
                    System.out.print(row);
                } else {
                    System.out.print(0);
                }
                System.out.print(" ");
                value++;
            }
            System.out.println();
            row++;
        }
    }
}
