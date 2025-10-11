public class pattern22 {
    public static void main(String[] args) {
        int n=5;
       int row=1;
       int space=-1;
       int star=n;
        while(row<=n){         
            int i=1;
            if(star==5){
                i=2;
            }
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            
            int k=1;
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            row++;
            star--;
            space=space+2;
        }
    }
}
