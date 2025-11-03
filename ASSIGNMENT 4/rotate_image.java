import java.util.*;
public class rotate_image {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr[0].length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
               
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0, k = n - 1; i < k; i++, k--) {
                int temp = arr[i][j];
                arr[i][j] = arr[k][j];
                arr[k][j] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
