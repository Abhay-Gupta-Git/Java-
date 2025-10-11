import java.util.*;
public class array_target_sum_3{
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
       Arrays.sort(arr);
       for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
              for(int k=j+1;k<arr.length;k++){
               if(arr[i]+arr[j]+arr[k]==m){    
                   System.out.print(arr[i]+", "+arr[j]+" and "+arr[k]);
                   System.out.println();}
               }
           }
       }
    }

}

