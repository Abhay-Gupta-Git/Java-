public class max_circular {
    public static void main(String[] args) {    
        int []arr={5,-3,5};
        System.out.println(maximum(arr));
    }   
    public static int maximum(int[]arr) {
        int linear_max=dot(arr);
        int total_sum=0;
        for (int i = 0; i < arr.length; i++) {
            total_sum+=arr[i];
            arr[i]=arr[i]*-1;
        }
        int circular_sum=total_sum+dot(arr);
        if(circular_sum==0){
            return linear_max;
        }
        return Math.max(linear_max,circular_sum);
        
    }
    public static int dot(int arr[]) {
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < arr.length; i++) { 
                sum=sum+arr[i];
                ans=Math.max(ans,sum);
                if(sum<0){
                    sum=0;
                } 
        }
        return ans;
         
     }
     
}
