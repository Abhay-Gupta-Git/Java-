
import java.util.Arrays;
import java.util.Scanner;

public class araay_sort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int arr[]=new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();   
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
