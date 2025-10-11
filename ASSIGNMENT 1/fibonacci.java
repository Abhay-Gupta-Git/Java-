import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   

        int row = 1;           
        int a = 0, b = 1;      

        while (row <= N) {
            int star = 1;       
            while (star <= row) {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
                star++;
            }
            System.out.println();
            row++;
        }
    }
}

