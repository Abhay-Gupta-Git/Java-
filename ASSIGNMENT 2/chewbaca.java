
// import java.util.Scanner;

// public class chewbaca {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         long n=sc.nextLong();
//         System.out.println(chew(n));
//     }
//     public static long chew(long n){
//         long s=0;
//         long mul=1;
//         if(n==9){
//             return 9;
//         }
//         while(n!=0){    
//             long rem=n%10;
//             if(n<10){
//                  s=(rem)*mul+s;
//             }
        
//             else{
//                 if(rem>=(9-rem)){
//                     s=(9-rem)*mul+s;
//                 }
//                 else{
//                      s=(rem)*mul+s; 
//                 }  
//             } 
//             mul*=10;
//             n=n/10;  
//         }
//         return s;
//     }
    
// }
import java.util.*;
public class chewbaca {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.print(chew(n));
    }

    public static long chew(long n){
        long sum = 0;
        long diff = 0;
        long power = 0;

       while(n>0){
           long rem = n%10;
           diff = 9-rem;

           if(n<10 && rem==9){}
           else{
            if(rem>diff){
             rem = diff;
            }
          }

           sum = sum + rem*(long)Math.pow(10,power);
           power++;
           n = n/10;
       }
       return sum;
    }
}