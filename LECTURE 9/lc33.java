public class lc33 {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        System.out.print(search(arr, target));
    }
    public static int search(int arr[],int target){
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid= lo+(hi-lo)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[lo]<=arr[mid]){
                // upper part
                if(arr[lo]<=target && arr[mid]>target){
                  hi=mid-1;
                }
                else{
                    lo=mid+1;
                }
            }
               // lower part
            else{
                if(arr[hi]>=target && arr[mid]<target){
                    lo=mid+1;
                }
                else{
                    hi=mid-1;
                }
            }
            }
        return -1;
    }
}
