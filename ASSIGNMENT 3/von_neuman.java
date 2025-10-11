import java.util.*;
public class von_neuman {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];  
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLong();
        }
        for(int i = 0; i < arr.length; i++) {
            long sum = 0;
            int power = 0;
            long num = arr[i];  

            while(num != 0) {
                long rem = num % 10;
                sum += rem * (long)Math.pow(2, power);
                power++;
                num /= 10;
            }

            System.out.println(sum);
        }
    }
}


