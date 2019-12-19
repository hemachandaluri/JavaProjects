package com.java.interitence;

class ParentClass{
	   public void ParentClass()
	   {
		System.out.println("Class Car");
	   }
	   public void vehicleType()
	   {
		System.out.println("Vehicle Type: Car");
	   }
	}
	class ChildClass extends ParentClass{
	   public void ChildClass()
	   {
		System.out.println("Class Ford");
	   }
	   public void brand()
	   {
		System.out.println("Brand: Mustang");
	   }
	   public void speed()
	   {
		System.out.println("Max: 90mph");
	   }
	}
	public class SubChildClass extends ChildClass{

	   public void SubChildClass()
	   {
		System.out.println("Mustang Model: Continental GT");
	   }
	   public void speed()
	   {
		System.out.println("Max: 80mph");
	   }
	   public static void main(String args[])
	   {
		 SubChildClass scc=new SubChildClass();
		 scc.vehicleType();
		 scc.brand();
		 scc.speed();
	   }
	}
