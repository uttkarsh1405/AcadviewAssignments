import java.lang.*;
import java.util.*;
class Main
{
  public static void main(String [] aa)
  {
    Scanner ss=new Scanner (System.in);
    System.out.println("enter the no");
    int a=ss.nextInt();
    int i,j,b,c=0;
    b=a;
    while(b!=0)
    {
      j=b%10;
      c=c+(j*j*j);
      b=b/10;
    }
    if(a==c)
    {
      System.out.println("no is amstrong ");
    }
    else
    {
      System.out.println("no is not amstrong ");
    }
    ss.close();
  }
}