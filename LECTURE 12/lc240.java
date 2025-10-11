
import java.util.Scanner;

public class lc240 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int[][]arr={{1,4,7,11,15},
                    {2,5,8,12,19},
                    {3,6,9,16,22},
                    {10,13,14,17,24},
                    {18,21,23,26,30}};
        System.out.println(search(arr, target));

    }
    public static boolean search(int [][]arr,int target){
        int row=0;
        int col=arr[0].length-1;
        while(row<arr.length&&col>=0){
            if(arr[row][col]==target)
            {
                return true;
            }
            else if(arr[row][col]>target){
                    col--;
            }
            else{
                row++;
            }
        }
        return false;  
    }
    
}
