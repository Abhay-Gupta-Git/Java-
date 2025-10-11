
import java.util.Scanner;

public class sum_of_even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println(sum(n));
    }
    public static long sum(long n){
        long esum=0;
        long osum=0;
        long count=1;
        while(n!=0){
            long rem=n%10;
            if(count%2==0){
                esum=esum+rem;
            }
            else{
                osum=osum+rem;
            }
            count++;
            n/=10;
        }
       
        System.out.println(osum);
        return esum;
        
        
    }

}
