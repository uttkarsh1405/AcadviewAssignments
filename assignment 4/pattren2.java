import java.lang.*;
import java.util.*;
class Main
{
  public static void main(String [] aa)
  {
    int k=0;
    for(int i=5;i>=0;i--)
    {
      k=i;
      while(k!=0)
      {
        System.out.print("*");
        k--;
      }
      System.out.println();
    }
  }
}