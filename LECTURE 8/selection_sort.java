public class selection_sort {
    public static void main(String[] args) {
        int arr[]={4,-1,5,3,1,2};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            int idx=min_index(arr, i);
            int temp=arr[idx];
            arr[idx]=arr[i];
            arr[i]=temp;   
        }   
    }
    public static int min_index(int[]arr,int index) {
        int mini=index;
        for (int i = index+1; i < arr.length; i++) {
            if(arr[i]<arr[mini])
            {
                mini=i;
            }    
        }
        return mini;
    }
}
