import java.util.Arrays;
import java.util.Scanner;

public class pair_of_roses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m=sc.nextInt();
            int arr[]=new int[m];
            for(int j=0;j<arr.length;j++){
                     arr[j]=sc.nextInt();
                    }
                int t=sc.nextInt();
                Arrays.sort(arr);
                int sum=Integer.MAX_VALUE;
                int count=Integer.MAX_VALUE;
                int a=0;
                int b=0;
            for (int j = 0; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(arr[j]+arr[k]==t){
                        int diff=arr[k]-arr[j];
                        sum=Math.min(sum,diff);
                        if(count>sum){
                          a=j;
                          b=k;  
                          count=sum; 
                        }
                    }
                }   
            }
            System.out.print("Deepak should buy roses whose prices are "+arr[a]+" and "+arr[b]+".");
            System.out.println();
        }
    }
}
