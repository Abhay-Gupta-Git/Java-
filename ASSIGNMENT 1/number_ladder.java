import java.util.Scanner;

public class number_ladder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v=1;
        for(int i=1;i<=n;i++){         
            for(int j=1;j<=i;j++){
                System.out.print(v+"\t");
                v++;
            }
            System.out.println();

        }
    }
}

