import java.util.*;
public class Class1 {
    String a;
    void divya(){
        System.out.println("this is method");
        System.out.println(a);
    }
    public static void main(String[] args){
        Class1 obj=new Class1();
        obj.a="divya";
        obj.divya();
    }
}
