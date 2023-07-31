import java.util.*;
public class Array {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int n=s.nextInt();
        int[] a=new int[50];
        System.out.println("enter elements");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for( int i=0;i<n;i++)
        {
           System.out.println(a[i]); 
        }
    }
    
}
