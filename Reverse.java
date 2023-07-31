import java.util.*;
public class Reverse {
    public static void main(String[] args){
        System.out.println("enter n value");
        System.out.println("enter m value");
        Scanner s=new Scanner(System.in) ;
        int n=s.nextInt();
        int[] a=new int[n];
        int mid=n/2;
        int temp;
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
 
            a[i]=s.nextInt();
          
        }
        for(int i=0;i<mid;i++){
           

            temp=a[n-i-1];
            a[n-i-1]=a[i];
            a[i]=temp;
            
        }
        for(int i=0;i<n;i++){
            
            System.out.println(a[i]);
             
        }
        
        
    }
    
}
