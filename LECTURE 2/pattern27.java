public class pattern27 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int star=1;
        int space=n-1;
        
        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print("\t");
               i++;
            }
            int j=1;
            int v=1;
            while(j<=star){
                System.out.print(v+"\t");
                if(j<=star/2){
                    v++;   
                }
                else{
                    v--;
                }
                j++;
                
            }
            System.out.println();
            row++;
            star=star+2;
            space--;

        }

    }
}
  
