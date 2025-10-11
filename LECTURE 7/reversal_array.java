public class reversal_array {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
        int k=3;
        rotate(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void rotate(int arr[],int k) {
        int n=arr.length;
        k=k%n;
        // starting ke n-k element reverse
        reverse(arr,0,n-k-1);
        // last ke k elemet reverse
        reverse(arr,n-k,n-1);
        // all elemenets revrse
        reverse(arr,0,n-1);
  }
  public static void reverse(int arr[],int i,int j) {
    while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
    }
      
  }
}