import java.util.Scanner;

public class hollow_rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  
        int row = 1;           
        while (row <= N) {
            // print spaces
            int space = 1;
            while (space <= N - row) {
                System.out.print(" ");
                space++;
            }

            // print stars 
            int star = 1;
            while (star <= N)
            // condition
             {
                if (row == 1 || row == N || star == 1 || star == N) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                star++;
            }

            System.out.println();
            row++;
        }
    }
}
