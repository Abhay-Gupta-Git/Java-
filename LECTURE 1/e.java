public class e {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int star=5;
        int space=0;
        while(row<=n){
        // for space
        int i=1;
        while(i<=space){
        System.out.print("  ");
        i++;
        }
        // for starss
        int j=1;
        while(j<=star){
            System.out.print("* ");
            j++;
        }
        // next row ki prepration
        row++;
        System.out.println();
        star--;
        space=space+2;
        }
        
    }
    }


