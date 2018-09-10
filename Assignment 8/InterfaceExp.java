import java.lang.*;
import java.util.*;
interface  Hello
{
  public int a=10;
  int b=110;
 // public void get();
  void printt();
}
class Hell implements Hello
{
  public void printt()
  {
    System.out.print(a+" "+b);
  }
}
class InterfaceExp
{
  public static void main(String [] aa)
  {
   Hell hh=new Hell();
   //hh.get();
   hh.printt();
  }
}