package ListProject;
import java.util.*; 

public class LinkedListProgram {

	public static void main(String args[]) {
        LinkedList<String> Ll = new LinkedList<String>(); 
      //Adding elements to the linked list
        Ll.add("A"); 
        Ll.add("B"); 
        Ll.addLast("C"); 
        Ll.addFirst("D"); 
        Ll.add(2, "V"); 
        Ll.add("F"); 
        Ll.add("G"); 
        System.out.println("Linked list : " + Ll);
        
      //Cloning an object
        Ll.clone();
        System.out.println("Cloned Linked list: " + Ll);
        
      //Finding Index
        System.out.println("The index of 'V'is: " +Ll.indexOf("V"));
        
     // Removing elements from the linked list 
        Ll.remove("B"); 
        Ll.remove(3); 
        Ll.removeFirst(); 
        Ll.removeLast(); 
        System.out.println("Linked list after deletion: " + Ll);
        
      //Checking for the value in the list
        // Finding elements in the linked list 
        boolean status = Ll.contains("V"); 
  
        if(status) 
            System.out.println("List contains the element 'V' "); 
        else
            System.out.println("List doesn't contain the element 'V'"); 
  
        // Number of elements in the linked list 
        int size = Ll.size(); 
        System.out.println("Size of linked list = " + size); 
  
        // Get and set elements from linked list 
        Object element = Ll.get(2); 
        System.out.println("Element returned by get() : " + element); 
        Ll.set(2, "Y"); 
        System.out.println("Linked list after change : " + Ll); 


}

}
