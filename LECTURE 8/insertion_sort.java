public class insertion_sort {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6,9,2};
        sort(arr);
    }
    public static void sort(int[]arr) {
        for (int i = 1; i < arr.length; i++) {
            insert(arr, i);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void insert(int[]arr,int i) {
        int item=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>item){
            arr[j+1]=arr[j];
            arr[j]=item;
            j--;
        }
    }
}
