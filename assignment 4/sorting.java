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
    for(i=0;i<a-1;i++)
    {
      for(j=0;j<a-i-1;j++)
      {
        if(b[j]>b[j+1])
        {
          temp=b[j];
          b[j]=b[j+1];
          b[j+1]=temp;
        }
      }
    }
    for(int q:b)
    {
      System.out.println(q);
    }
    ss.close();
  }
}