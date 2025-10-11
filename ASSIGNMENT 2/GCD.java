

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long m=sc.nextLong();
        System.out.println(work(n, m));
        
    }
    public static long work(long n,long m){
        long sum=0;
        for (int i = 1; i < greater(n, m) ; i++) {
            if(n%i==0&&m%i==0){
                sum=i;
            }
            
       }return sum;
    }
    public static long greater(long n,long m){
        long num=0;
        if(n-m <=0){
            num=m;
        }
        else{
            num=n;
        }return num;
    }
}
