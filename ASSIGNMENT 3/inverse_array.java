import java.util.Scanner;

public class inverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        int inverse[] = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();   
        }
        for (int i = 0; i < arr.length; i++) {
            inverse[arr[i]] = i;
        }
        for (int i = 0; i < inverse.length; i++) {
            System.out.print(inverse[i] + " ");
        }
    }
}
