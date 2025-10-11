import java.util.*;
public class array_target_sum {
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
     }
     int m=sc.nextInt();
     sum(arr,n,m);
     

    }
    public static void sum(int arr[],int n,int m){
       for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]+arr[j]==m){
                   if(arr[i]>arr[j]){
                   System.out.print(arr[j]+" and "+arr[i]);
                   System.out.println();}
                   else{
                   System.out.print(arr[i]+" and "+arr[j]);
                   System.out.println();}
               }
           }
       }
    }
    
}