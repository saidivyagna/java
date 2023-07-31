import java.util.*;
public class Elseif 
{
    public static void main(String... args)
    {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        if(x>0 && x<299){
            System.out.println("mobile plan");
        }
         else if(x>299 && x<499)
        {
            System.out.println("tv plan");
        }
        else 
        {
            System.out.println("lapi plan");
        }
       

    }

        
    
    
}
