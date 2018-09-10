import java.util.*;
import java.lang.*;
import java.io.*;
class Parents
{
  int a=10;
  public void printt()
  {
    System.out.println(" function called from parent class "+a);
  }
}
class Child extends Parents
{
  Child()
  {
    super.printt();/*here we used this syntax to call the function of the parent class here we can call without creating the object for the parent class*/
  }
}
class Invokee
{
  public static void main(String []   aa)
  {
    Child cc=new Child();
  }
}
