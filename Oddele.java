import java.util.*;
public class Oddele {
    public static void main(String[] args){
        System.out.println("enter n value");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int[][] a=new int[n][m];
        int[][] b=new int[n][m];
        int k=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=k;
                k=k+2;
                 System.out.print(a[i][j]+" ");
            }System.out.println();
        }
    }
    
}
