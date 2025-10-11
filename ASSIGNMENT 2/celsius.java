
import java.util.Scanner;

public class celsius {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        int min=sc.nextInt();
        int max=sc.nextInt();
        int diff=sc.nextInt();
        temp(min, max, diff);
        
        }
    }
    public static void temp(int min,int max,int diff){
        while(min<=max){
            int c=(5*(min-32))/9;
            System.out.print(min+" ");
            System.out.print(c);
            min=min+diff;
            System.out.println();
        }
    }
}
