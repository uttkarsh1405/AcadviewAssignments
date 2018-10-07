import java.util.*;
import java.lang.*;
import java.io.*;

class assignele {
  public static void main(String[] args)throws IOException {
   //try
   //{
   FileReader f=new FileReader("abc.txt");
   FileWriter ff=new FileWriter("xyz.txt");
   int data=f.read();
   while(data!=-1)
   {
     System.out.println((char)data);
     ff.write(data);
    data=f.read();
   }
   f.close();
   ff.close();
  }
/*}
catch(Exception e)
{
  System.out.println(e);
}*/
}