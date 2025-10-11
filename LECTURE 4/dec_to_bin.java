
public class dec_to_bin {
    public static void main(String[] args) {
        int n=37;
        int mul=1;
        int s=0;
        while(n>0){
            int rem=n%2;
            s=s+rem*mul;
            mul=mul*10;
            n=n/2;

        }
        System.out.println(s);
    }
}
