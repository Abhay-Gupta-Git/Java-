import java.util.Scanner;

public class product_except_yourself{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        long arr[] = new long[m];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextLong();
        }
        long[] c = product(arr);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }

    public static long[] product(long[] arr) {
        int n = arr.length;
        long[] left = new long[n];
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * arr[i - 1];
        }
        long[] right = new long[n];
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * arr[i + 1];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = left[i] * right[i];
        }
        return arr;
    }
}
