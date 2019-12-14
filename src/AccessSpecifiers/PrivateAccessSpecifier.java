package AccessSpecifiers;

public class PrivateAccessSpecifier {
	private void display() 
    { 
        System.out.println("Private Access Specifier"); 
    } 
} 
  
class B 
{ 
   public static void main(String args[]) 
      { 
	   PrivateAccessSpecifier obj = new PrivateAccessSpecifier(); 
          //trying to access private method of another class 
          obj.display(); 
      } 

}
