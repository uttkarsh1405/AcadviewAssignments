import java.util.Arrays;
import java.util.Scanner;
class test
{
 public static <T> void sorts(T [] a)
 {
     Arrays.sort(a);
    for(T obj:a)
    {
      System.out.print(obj+" ");
    }
    System.out.print("\n");
 }

}
class Main {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    int n=obj.nextInt();
    Integer a[] = new Integer[n];
    String  b[]= new String[n];
    for(int i=0;i<n;i++)
    {
       a[i]=obj.nextInt(); 
    }
    for(int i=0;i<n;i++)
    {
       b[i]=obj.next(); 
    }
    test.sorts(a);
    test.sorts(b);
  }
}