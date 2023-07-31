import java.util.*;
import java.util.concurrent.ExecutionException;
public class Try{
    public static void main(String[] args)
    {
        System.out.println("this is");
        dis();
    }
    static void dis(){
        try{
             System.out.println(10/0);
             System.out.println("it is reached");
            }
        catch(Exception e){
         System.out.println("this is exception:"+e);
        }

    }
}
