
import java.util.Scanner;

public class array_2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][]arr=new int[n][m]; 
         //number of 1D arrays are formed is N+1 where N is number of rows............
        // System.out.println(arr);
        // System.out.println(arr[0]);
        // System.out.println(arr[0][2]);
        // System.out.println(arr.length);// for row
        // System.out.println(arr[0].length); //for column

        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.nextInt();    
            }  
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");   
            }  
            System.out.println();
        }
    }
}
