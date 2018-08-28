import java.lang.*;
import java.util.*;
class Main {
  public static void main(String   [] aaa) {
   System.out.println("enter the no");
   Scanner ss=new Scanner(System.in);
   int a,b=0;
    a=ss.nextInt();
    while(a!=0)
    {
      int rem=a%10;
      b=b*10+rem;
      a=a/10;
    }
    System.out.println(b);
   ss.close();
   }
}