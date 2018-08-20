import java.util.Scanner;


public class Palindrome 

{

    public static void main(String[] args)
    {



        int num , rev = 0, rem, original;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number:");

        num=s.nextInt();




        original = num;


       
 while( num != 0 )

        {

            rem = num % 10;
 
            rev = rev * 10 + rem;
 
            num  /= 10;
     
        }

        
   
        if (original == rev)
         
       System.out.println(original + " is a palindrome.");

       else

       System.out.println(original + " is not a palindrome.");
 
   }

}