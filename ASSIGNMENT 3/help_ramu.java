
import java.util.Scanner;

public class help_ramu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int z = 0; z < t; z++) {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int no_of_rikshaw=sc.nextInt();
        int no_of_cab=sc.nextInt();
        int[] rickshaw=new int[no_of_rikshaw];
        int[] cab=new int[no_of_cab];
        for (int i = 0; i < rickshaw.length; i++) {
            rickshaw[i]=sc.nextInt();
        }
        for (int i = 0; i < cab.length; i++) {
            cab[i]=sc.nextInt();
        }
        System.out.println(min_sum(rickshaw, cab, a, b, c, d));
    
        }
    }
    public static int min_sum(int []rickshaw,int[]cab,int a,int b,int c,int d) {
        int cost_rikshaw=0;
        for (int i = 0; i < rickshaw.length; i++) {
            cost_rikshaw+=Math.min(rickshaw[i]*a, b);
        }
        cost_rikshaw=Math.min(cost_rikshaw,c);
        int cost_cab=0;
        for (int i = 0; i < cab.length; i++) {
            cost_cab+=Math.min(cab[i]*a, b);
        }
        cost_cab=Math.min(cost_cab,c);
        int add=cost_rikshaw+cost_cab;
        int m=Math.min(add, d);
        return m;

        
    }
}


