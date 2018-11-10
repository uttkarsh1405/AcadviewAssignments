
import java.util.Scanner;
class test
{
 public static <T> void show(T [] a)
 {
    
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
    Double c[]= new Double[n];
    Character d[]= new Character[n];
    for(int i=0;i<n;i++)
    {
       a[i]=obj.nextInt(); 
    }
    for(int i=0;i<n;i++)
    {
       b[i]=obj.next(); 
    }
    for(int i=0;i<n;i++)
    {
       c[i]=obj.nextDouble(); 
    }
    for(int i=0;i<n;i++)
    {
       d[i]=obj.next().charAt(0); 
    }
    test.show(a);
    test.show(b);
    test.show(c);
    test.show(d);
  }
}