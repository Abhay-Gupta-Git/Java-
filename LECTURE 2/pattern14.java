public class pattern14 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int star=1;
        int space=n-1;
        while(row<=2*n-1){
            int j=1;
            while(j<=space){
                System.out.print("  ");
            }
            // for star
            int i= 1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            // mirror
            if(row<n){
                star++;}
            else {
                star--;
            }
            
            // for next line
            row++;
            System.out.println();

        }
    }
}

