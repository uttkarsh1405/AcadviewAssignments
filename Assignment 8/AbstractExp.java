import java.lang.*;
import java.util.*;
import java.io.*;
abstract class Hello
{
  int a,b=0,c=1,sum=0;
  abstract void get();
  abstract void printt();
}
class Hell extends Hello
{
  void get()
  {
    Scanner ss=new Scanner (System.in);
    System.out.println("enter the size");
    a=ss.nextInt();
    ss.close();
  }
  void printt()
  {
    for(int i=0;i<a;i++)
    {
      System.out.println(sum);
      sum=b+c;
      b=c;
      c=sum;
      
    }
  }
}
class AbstractExp
{
  public static void main(String [] aa)
  {
  Hell hh=new Hell();
  hh.get();
  hh.printt();
  }
}