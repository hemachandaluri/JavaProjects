package AccessSpecifiers;

public class ProtectedAccessSpecifier {
	
		   protected void display() 
		    { 
		        System.out.println("Protected Access Specifier"); 
		    } 
		}

class TestPAS extends ProtectedAccessSpecifier 
{ 
   public static void main(String args[]) 
   {   
	   TestPAS obj = new TestPAS();   
       obj.display();   
   }   
      
}