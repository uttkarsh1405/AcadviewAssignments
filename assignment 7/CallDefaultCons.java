import java.util.*;
import java.lang.*;
class Parent
{
    Parent()
    {
     System.out.println("parent constructor called by calling parameter constructor int he child class");   
    }
    Parent(int a)
    {
      this();
    }
}
class  CallDefaultCons
{
    public static void main(String [] aa)
    {
       Parent pp=new Parent(10);
    }
}