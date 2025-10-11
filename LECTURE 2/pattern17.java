

public class pattern17 {
    public static void main(String[] args) {
       int n=7;
       int row=1;
       int space=1;
       int star=(n/2)-1;
        while(row<=n){         
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            if(row<=n/2){
                star--;
                space+=2;
            }
            else{
                star++;
                space-=2;
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



