import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long m=sc.nextLong();
        System.out.println(work(n, m));
        
    }
    public static long work(long n,long m){
        long count=0;
        while(n!=0){
            long rem=n%10;
            if(rem==m){
                count++;
            }
            n/=10;

        }return count;
    }
}
