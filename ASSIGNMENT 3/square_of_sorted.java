import java.util.*;
public class square_of_sorted {
    public static void main (String args[]) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
        arr[i]=arr[i]*arr[i];
    }
    Arrays.sort(arr);
    for(int m=0;m<arr.length;m++){
          System.out.print(arr[m]+" ");
      }
    }
}

