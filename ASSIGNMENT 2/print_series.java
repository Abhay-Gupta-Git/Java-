import java.util.*;
public class print_series {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        print(a,b);
    }

    public static void print(int a, int b){
        int count = 0;
        for(int i=1;count<a;i++){
            int n = 3*i + 2;
            if(n%b!=0){
                System.out.println(n);
                count++;
            }
        }
    }
}