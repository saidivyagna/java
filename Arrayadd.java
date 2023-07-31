import java.util.*;
public class Arrayadd{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter x:");
        System.out.println("enter y:");
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
        } 
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
               System.out.print(a[i][j] +" ");
               
            } System.out.println( );          
        }   
        int[][] b=new int[n][m];
        System.out.println("enter elements");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                b[i][j]=s.nextInt();
               
           } 
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
               System.out.print(b[i][j]+" " );
               
            } System.out.println( );          
        } System.out.println( );  
         int[][] c=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
               System.out.print(c[i][j]+" " );
               
            } System.out.println( );          
        }   
         

    }
}
