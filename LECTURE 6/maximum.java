// public class maximum {
//     public static void main(String[] args) {
//         int[]arr={-10,-3,-4,-6,-7,-9};   
//         System.out.println(max(arr));
//     }
//     public static int max(int[]arr){ 
//         int n=arr[0];
//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i]>n){
//                 n=arr[i];   
//             }     
//         }return n;
//     }
// }

public class maximum {
    public static void main(String[] args) {
        int[]arr={-10,-3,-4,-6,-7,-9};   
        System.out.println(max(arr));
    }
    public static int max(int[]arr){ 
        int n=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>n){
                n=arr[i];   
            }     
        }return n;
    }
}

