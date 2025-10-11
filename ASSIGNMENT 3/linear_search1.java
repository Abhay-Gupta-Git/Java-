import java.util.*;
public class linear_search1 {

    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int m=sc.nextInt();
    int count=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==m){
            System.out.print(i);
            count++;
        }
    }
    if(count==0){
        System.out.print(-1);
    }
    }
}


