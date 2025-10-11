public class reverse1 {
    public static void main(String[] args) {
        int[]arr={2,4,6,7,8,5,9}; 
        rev(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
}
 public static void rev(int[]arr){
    int i=0;
    int j=arr.length-1;
    while(i<j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    i++;
    j--;
       } 
    }
 
}
