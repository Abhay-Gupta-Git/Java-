
import java.util.Scanner;

public class fibonacci {
    public static int fab(int n){
        int a=0;
        int b=1;
        int sum=a+b;
        for(int i=1;i<n;i++){
            sum = a+b;
            a=b;
            b=sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fab(n));

    }
    
}
