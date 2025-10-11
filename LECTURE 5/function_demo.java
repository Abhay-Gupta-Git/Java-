public class function_demo {
    public static void main(String[] args) {
        System.out.println("hello");
        int a=9;
        int b=6;
        // int x=add(a,b);
        // System.out.println(x);
        System.out.println(add(b,a));
        System.out.println("bye");
    }
    

   public static int add(int a,int b){
    int c=a+b;
    return c-sub(c,a) ;
   }
   public static int sub(int a,int b){
    int c=a-b;
    return c;

    
   }
}