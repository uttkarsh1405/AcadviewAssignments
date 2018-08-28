abstract class vehicle

{

    abstract void start();

    void stop(){}

}

class twowheeler extends vehicle

{

    void start()

    {

        System.out.println("TwoWheeler Start func() Called");

    }

    void stop()

    {

        System.out.println("TwoWheeler Stop func() Called");

    }

}

class fourwheeler extends vehicle

{

    void start()

    {

        System.out.println("FourWheeler Start func() Called");

    }

    void stop()

    {

        System.out.println("FourWheeler Stop func() Called");

    }

}


public class abstract_prog

{

    public static void main(String args[])

    {

        vehicle obj = new twowheeler();

        obj.start();

        obj.stop();

        vehicle obj1 = new fourwheeler();

        obj1.start();

        obj1.stop();

    }

}
