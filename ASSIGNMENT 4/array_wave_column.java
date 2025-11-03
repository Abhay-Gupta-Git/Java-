

import java.util.*;
public class array_wave_column {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
 for (int j = 0; j < arr[0].length; j++) {
    if(j%2==0){
        for (int i = 0; i < arr.length; i++) {    
            System.out.print(arr[i][j]+", ");  
        }
    }
    if(j%2==1){
        for (int i = arr.length-1; i >=0; i--) {    
            System.out.print(arr[i][j]+", ");   
        }
    }
         
    }   
    System.out.print("END");              
    }
    
}

