import java.util.*;
public class Throw {
    public static void main(String[] args)
    {
        display();
    }
    static void display()
    {
        try{
            throw new Exception("emty"); 
        }
        catch(Exception e)
        {
            System.out.println("exception:"+e);
            throw Exception;
        }
    }
}

