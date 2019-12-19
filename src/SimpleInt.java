package com.java.interitence;

//Interface
	interface Int1 
	{ 
	    default void display() 
	    { 
	        System.out.println("hello"); 
	    }
	  
	// A class that implements the interface. 
	class SimpleInt implements Int1 
	{ 
	    //MainMethod
	    public static void main(String args[])
	    { 
	    	SimpleInt si = new SimpleInt(); 
	    	si.display(); 
	    } 
	}

}
