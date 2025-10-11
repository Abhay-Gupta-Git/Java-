
// import java.util.Scanner;

// public class reverse {
//     public static long rev(long n){
//         long sum=0;
//         while(n>0){
//             long r=n%10;
//             if(r==0){
//                 r=5;
//             sum=sum*10+r;}
//             else{
//                 sum=sum*10+r;
//             }
//             n/=10;

//         }
//         long store=0;
//         while(sum>0){
//             long remainder=sum%10;
//              store=store*10+remainder;
//              sum/=10;
//         }


//         return  store;
//     }
//     public static void main(String[] args) {

//         Scanner sc= new Scanner(System.in);
//         long n=sc.nextLong();
//         System.out.println(rev(n));
//     }
    
// }

import java.util.Scanner;

public class reverse {
    public static int rev(int n){
        int sum=0;
        while(n!=0){
            int r=n%10;
            sum=sum*10+r;
            n/=10;

        }
        return sum;
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(rev(n));
    }
    
}

