package ListProject;
import java.util.*; 

public class HashList {
	
	public static void main(String args[]) {
    HashSet<String > hs = new HashSet<>();
    HashSet<String > hs1 = new HashSet<>();
    hs.add("Hema"); 
    hs.add("Chandaluri"); 
    hs.add("is the Best"); 
    System.out.println("Hash list : " + hs);

    // create a clone or shallow copy of hash table h 
    hs1 = (HashSet<String>)hs.clone(); 

    // checking clone h1 
    System.out.println("values in clone: " + hs1); 

    // clear hash table h 
    hs.clear();

    // checking hash table h 
    System.out.println("after clearing: " + hs);

	
	}
}
