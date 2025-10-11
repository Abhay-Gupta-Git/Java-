public class reverse_range {
    public static void main(String[] args) {
        int[]arr={2,4,6,7,8,10,55,9,50,40,45,25,60}; 
        rev(arr,4,11);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
        
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
