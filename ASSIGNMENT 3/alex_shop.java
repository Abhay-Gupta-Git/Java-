import java.util.Scanner;
public class alex_shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        int maxPrice = 0;

        // Find max price for array bounds and count frequencies
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
            }
        }

        // Frequency array for prices
        int[] freq = new int[maxPrice + 1];
        for (int i = 0; i < n; i++) {
            freq[prices[i]]++;
        }

        int q = sc.nextInt();

        for (int query = 0; query < q; query++) {
            int A = sc.nextInt();
            int k = sc.nextInt();

            int count = 0;

            // Check all prices where frequency > 0
            for (int price = 1; price <= maxPrice; price++) {
                if (freq[price] > 0 && A % price == 0) {
                    count++;
                }
            }

            if (count >= k) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        sc.close();
    }
}


