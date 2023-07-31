import java.util.*;

public class Fibonocci {
    public static void main(String[] args){
        Scanner s=new Scanner (System.in);
        int x=s.nextInt();
        int f0=0;
        int f1=1;
        int f2;
        System.out.println(f0);
        System.out.println(f1);
        for(int i=5;i<=x;i++){
            f2=f1+f0;
            f1=f2;
            f0=f1;
            System.out.println(f2);
        }

    }
    
}
