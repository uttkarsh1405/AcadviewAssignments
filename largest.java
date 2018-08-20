import java.util.Scanner;

public class Largest 

{
   
 public static void main(String[] args) 
   
 {
         
       int x, y, z;
        
       Scanner s = new Scanner(System.in);
 
       System.out.println("Enter all three numbers:");
  
       x=s.nextInt();

       y=s.nextInt();
  
       z=s.nextInt();
          
       if(x > y && x > z )
 
       System.out.println("First number is largest.");
 
       else if ( y > x && y > z )
 
       System.out.println("Second number is largest.");
 
       else if ( z > x && z > y )

       System.out.println("Third number is largest.");
 
       else  
 
      System.out.println("Entered numbers are not distinct.");
  
 }

}