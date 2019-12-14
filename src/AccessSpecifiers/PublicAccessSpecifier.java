package AccessSpecifiers;
public class PublicAccessSpecifier {
	
	public void display() 
    { 
        System.out.println("Public Access Specifier"); 
    } 

}
class test 
{ 
    public static void main(String args[]) 
      { 
    	PublicAccessSpecifier PAS = new PublicAccessSpecifier(); 
    	PAS.display(); 
      } 
} 