import java.util.*;
public class hour_glass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=0;
        int val=n;
        int row=1;
        int star=2*n+1;
        while(row<=2*n+1){
            //space
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            //star
            int j=1;
            val=n-space;
            while(j<=star){
                System.out.print(val+" ");
                if(j<=(star/2)){
                    val--;
                }
                else{
                    val++;
                }
                j++;
            }
            if(row<=n){
                space++;
                star-=2;
            }
            else{
                space--;
                star+=2;
            }
            System.out.println();
            row++;
        }

    }
}

