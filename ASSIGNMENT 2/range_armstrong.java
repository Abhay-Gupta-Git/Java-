
import java.util.Scanner;

public class range_armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        range(n, m);
        
    }
    public static void range(int n,int m){
        for (int i = n; i <= m; i++){
            int count=0;
            int temp=i;
            int arm=i;
            while(temp!=0){
                count++;
                temp/=10;
            }
            int sum=0;
            while(arm!=0){
                int rem=arm%10;
                sum=sum+(int)Math.pow(rem,count);
                arm/=10;
            }
            if(sum==i){
                System.out.println(i);
            }
            
        }
    }
}
