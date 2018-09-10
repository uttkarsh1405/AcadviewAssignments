import java.lang.*;
import java.io.*;
import java.util.*;
class  Convert
{
  public static void main(String []  aa)
  {
    Scanner ss=new Scanner (System.in);
    System.out.println("enter the string one");
    String a,b;
    a=ss.nextLine();
    System.out.println("enter the string two");
    b=ss.nextLine();
    System.out.println(a+" "+b);
    int c,d;
    c=Integer.parseInt(a);
    d=Integer.parseInt(b);
    if(c>d)
    {
     System.out.println("a is great");
    }
    else
    {
      System.out.println("b is great");
    }
  }
}