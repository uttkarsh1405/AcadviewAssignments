import java.lang.*;
import java.util.*;
class Main
{
  public static void main(String [] aa)
  {
    Scanner ss=new Scanner (System.in);
    System.out.println("enter the no");
    int a=ss.nextInt();
    int i=0,j,temp;
    int b[]=new int [a];
    while(a!=0)
    {
      b[i]=ss.nextInt();
      i++;
      a--;
    }
    System.out.println("enter the no to search");
    j=ss.nextInt();
    for(int q:b)
    {
     if(q==j)
     {
       System.out.println("no found");
     }
    }
    ss.close();
  }
}