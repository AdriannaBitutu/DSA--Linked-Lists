//134126
//Adrianna Bitutu Ndubi
import java.util.*; 
   
public class LinkedLists { 
    public static void main(String args[])  { 
        //create a linked list 
		//Error that could not be identified
        LinkedList&lt;String&gt; ll_list = new LinkedList&lt;String&gt;(); 
   
        // Add elements to linkedList using various add methods
        ll_list.add("B"); 
        ll_list.add("C"); 
        ll_list.addLast("G"); 
        ll_list.addFirst("A"); 
        ll_list.add(3, "D"); 
        ll_list.add("E"); 
        ll_list.add("F"); 
        
   
        // use size methods to return Number of elements in the linked list 
        int size = ll_list.size(); 
        System.out.println("Size of linked list = " + size); 
             
    } 
}
//OUTPUT
//[A, B, C, D, E, F, G]
//[7]
//BUILD SUCCESSFUL (total time: 0 seconds)