package designpattern;


// Java program to create Thread Safe
// Singleton class
public class Singleton
{
    // private instance, so that it can be
    // accessed by only by getInstance() method
    private static Singleton instance;

    private Singleton()
    {
        // private constructor
    }

    //synchronized method to control simultaneous access
    synchronized public static Singleton getInstance()
    {
        if (instance == null)
        {
            // if instance is null, initialize
            instance = new Singleton();
        }
        return instance;
    }
}