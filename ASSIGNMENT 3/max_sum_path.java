
import java.util.Scanner;

public class max_sum_path {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int z = 0; z < t; z++) { 
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[]=new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            
        }
        int arr1[]=new int[m];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=sc.nextInt();
            
        }
        System.out.println(max_sum(arr, arr1));
    }
}
public static int max_sum(int []arr,int arr1[]) {
    int i=0;
    int j=0;
    int p=0;
    int q=0;
    int ans=0;
    while(i<arr.length&& j<arr1.length){
        if(arr[i]<arr1[j]){
            i++;
        }
        else if(arr[i]>arr1[j]){
            j++;
        }
        else{
            int sum=0;
            for (int k = p; k <=i; k++) {
                sum+=arr[k];
                
            }
            int sum1=0;
            for (int k = q; k <=j; k++) {
                sum1+=arr1[k];      
            }
            ans+=Math.max(sum,sum1);
            i++;
            j++;
            p=i;
            q=j;

        }
    }
    int sum2=0;
    while(p<arr.length){
        sum2+=arr[p];
        p++;
    }
    
    int sum3=0;
    while(q<arr1.length){
        sum3+=arr[q];
        q++;
    }
    ans+=Math.max(sum2, sum3);
    return ans;
}
}
