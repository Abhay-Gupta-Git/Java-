
import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long m=sc.nextLong();
        System.out.println(work(n, m));
        
    }
    public static long work(long n,long m){
        long sum=0;
        for (int i = 1; i < 100000000; i++) {
            if(i%n==0&&i%m==0){
                sum=i;
                break;
            }
            
       }return sum;
    }
}
