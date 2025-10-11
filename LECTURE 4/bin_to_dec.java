public class bin_to_dec {
     
    public static void main(String[] args) {
        int n=101;
        int mul=1;
        int s=0;
        while(n>0){
            int rem=n%10;
            s=s+rem*mul;
            mul=mul*2;
            n=n/10;

        }
        System.out.println(s);
    }
}

