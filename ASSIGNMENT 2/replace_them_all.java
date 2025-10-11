
import java.util.Scanner;

public class replace_them_all {
    public static long rev(long n){
        long sum=0;
        long mul=1;
        if(n==0)
          return 5;
        while(n>0){
            long rem=n%10;
            if(rem==0){
                rem=5;
            }   
            sum=rem*mul+sum;
            n/=10;
            mul*=10;
        }
        return sum;

    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println(rev(n));
    }
    
}

