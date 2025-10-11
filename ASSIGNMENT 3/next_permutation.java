import java.util.Scanner;

public class next_permutation {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
      permutation(arr);
   for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
     }
    }
    public static void permutation(int arr[]) {
      int p=-1;
      for (int i = arr.length-2; i >= 0; i--) {
      if(arr[i]<arr[i+1]){
         p=i;
         break;
         }
      }
      if(p==-1){
         rev(arr,0,arr.length-1);
         return;
      }
      int q=-1;
      for (int i = arr.length-1; i >p; i--) {
         if(arr[i]>arr[p]){
            q=i;
            break;
         }   
      }
      int temp=arr[p];
      arr[p]=arr[q];
      arr[q]=temp;
      rev(arr,p+1,arr.length-1);
    }
    public static void rev(int[]arr,int i,int j){
      while(i<j){
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
      i++;
      j--;
      } 
  }
}
