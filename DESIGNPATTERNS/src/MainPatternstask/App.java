package com.epam.Patterns_task;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Structural Design Pattern - Singleton Design Pattern
    	/* Having only single instance of a class at any given point of time */
    	Singleton s = Singleton.getInstance();
    	
    	System.out.println("Singleton ID = " + s.getId());
    	System.out.println("Singleton Data = " + s.getData());
    	System.out.println("Singleton Dept= "+s.getDept());
    	System.out.println();
    	
    	//Behavioral Design Pattern - Template Design Pattern
    	/* Different classes have different functionalities but may work in similar manner */
    	
    	File1 f1 = new File1();	//extends Template class
    	File2 f2 = new File2();	//extends Template class
    	
    	System.out.println("File1 details");
    	f1.files();
    	
    	System.out.println("File2 details");
    	f2.files();
    	
    }
}
