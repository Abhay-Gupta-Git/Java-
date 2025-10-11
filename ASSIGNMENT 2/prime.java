
import java.util.Scanner;

public class prime {
    public static long Prime(long n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }    
        return c;   
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong(); 
        long c=Prime(n);
        if(c==2){
            System.out.println("Prime");
        }
        else {
             System.out.println("Not Prime");
        }
    }
}
