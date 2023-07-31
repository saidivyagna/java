
import java.util.*;
public class Factorial {
    public static void main(String... args){
       Scanner s=new Scanner(System.in);
       int x=s.nextInt();
       int fact=1;
       int i=1;
       for(i=1;i<=x;i++){
        fact=fact*i;
       
       }
       System.out.println(fact);
    }
}