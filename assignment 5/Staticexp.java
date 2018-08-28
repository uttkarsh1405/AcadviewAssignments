import java.util.*;
import java.lang.*;
class Staticexp
{
  static void hello()
  {
    System.out.print("static ");
  }
  void world()
  {
    System.out.print("block example!");
  }
  public static void main(String [] aa)
  {
     Staticexp mm=new Staticexp();
     hello();
     mm.world();
  }
}