import java.io.*;
class assignten
{
public static void main(String args[])
throws Exception{
  FileReader fr = new FileReader("abc.txt"); 
  int i; 
    while ((i=fr.read()) !=-1) 
    {
      System.out.print((char) i);

    }
  File f  = new File("abc.txt");
  String p= f.getAbsolutePath();
  System.out.print(p);	
}	
}