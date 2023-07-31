import java.util.*;
public class Catch {
    public static void main(String... args){
        Scanner s=new Scanner(System.in);
        int[] a=new int[5];
        for(int i=0;i<5;i++){
            a[i]=s.nextInt();
        }
        dis();
    }
/*  static void dis(){
        Scanner s=new Scanner(System.in);
        int[] a=new int[5];
        for(int i=0;i<5;i++){
            a[i]=s.nextInt();
        }
         try{    
         System.out.println(a[6]);}
         catch(Exception e){System.out.println("eee"+e);}
         finally{
            System.out.println("this is");}
    } */   
}
class exp{
    void dis(){
        
         try{    
         System.out.println(a[6]);}
         catch(Exception e){System.out.println("eee"+e);}
         finally{
            System.out.println("this is");}

    }
}
