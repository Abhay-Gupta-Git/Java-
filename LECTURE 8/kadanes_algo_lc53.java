public class kadanes_algo_lc53 {
    public static void main(String[] args) {
        int arr[]={2,3,-7,4,-1,8};
        System.out.println(dot(arr));
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
