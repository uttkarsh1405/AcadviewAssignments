class Animal

{

    String breed , colour;

    void speak()

    {

       System.out.println("Animal Speak func() called ");
    }

    

}

class dog extends Animal

{

  
   void speak()

     {

       System.out.println("Dog Speak func() called ");
     }
 

}


class cat extends Animal

{

    
    void speak()

       {

          System.out.println("Cat Speak func() called ");
    
   }


}

public class prog

{

    public static void main(String args[])
  
    {

        Animal obj1 = new Animal();
 
        obj1.speak();

        Animal obj2 = new dog();

        obj2.speak();
  
        Animal obj3 = new cat();

        obj3.speak();
  
    }

}