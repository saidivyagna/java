import java.util.*;
public class Class2{
    int c;
    void display(int a,int b){
        c=a+b;
        System.out.println(c); 
    }
    public static void main(String[] args){
       Class2 obj=new Class2();
       obj.display(2,3);
    }
}