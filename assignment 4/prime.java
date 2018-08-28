import java.lang.*;
import java.util.*;
class Main
{
  public static void main(String [] aa)
  {
    Scanner ss=new Scanner (System.in);
    System.out.println("enter the no");
    int a=ss.nextInt();
    int i,j,b;
    for(i=0;i<=a;i++)
    {
      b=0;
      for(j=1;j<=a;j++)
      {
      if(i%j==0)
      {
        b++;
      }
    }
    if(b==2)
    {
      System.out.println(i);
    }
    }
    ss.close();
  }
}