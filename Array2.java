import java.util.*;
public class Array2 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int n=s.nextInt();
        int m=s.nextInt();
        int[][] a=new int[n][m];
        System.out.println("enter elements");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
               a[i][j]=s.nextInt();
            }            
        }System.out.println( );
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
               System.out.print(a[i][j] );
               
            } System.out.println( );          
        }   
    }
}