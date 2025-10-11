public class buble_sort {
   public static void main(String[] args) {
    int arr[]={4,5,7,2,1};
    sort(arr);
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
        
    }
   }    
   public static void sort(int arr[]){
    for (int i = 1; i < arr.length; i++) {
        for (int j = 0; j < arr.length-i; j++) {
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }   
        }    
     }
   }
}
