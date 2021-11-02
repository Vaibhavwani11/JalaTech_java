import java.util.*; 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List; 
class ArrayListExample1{  
 public static void main(String args[]){  
  ArrayList<String> list=new ArrayList<String>();
      list.add("Mango");  
      list.add("Apple");    
      list.add("Banana");    
      list.add("Grapes");   
      list.add("Orange");  
      list.add("Papaya");    
      list.add("Guava");    
      list.add("Litchi");   
      list.add("Watermelon");    
      list.add("Kiwi"); 
         
      Iterator i = list.iterator();
      System.out.println("The ArrayList elements are:");
      while (i.hasNext()) {
         System.out.println(i.next()); 
      }
     list.add(2,"Lemon");
     System.out.println("The ArrayList elements after removing are:");
    
        i.remove(); // removing element
        list.remove(2);// removing element 2
        list.set(5, "Deepak"); // updating element at an index

        System.out.println("The element C is available in ArrayList? " + list.contains("Deepak")); // Check if element is present in ArrayList
        //int element =list.get(2);
        //System.out.println("the element at index 2 is " + element);

        list.clear(); //Remove all elements of the ArrayList
        System.out.println("\nAfter clear\n\n"+ "ArrayList: " + list);
 }
}