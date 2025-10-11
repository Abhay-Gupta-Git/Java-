
import java.util.Scanner;
public class bin_to_decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println(bin(n));
    }
     public static long bin(long n){
        long mul=1;
        long s=0;
        while(n>0){
            long rem=n%10;
            s=s+rem*mul;
            mul=mul*2;
            n=n/10;
        }
        return s;
    }
}
