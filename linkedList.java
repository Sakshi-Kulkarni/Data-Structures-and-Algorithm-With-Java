package DSA;
import java.util.*;
public class linkedList {
    public static void main(String args[]){  
        LinkedList<String> ll=new LinkedList<String>();  
                  System.out.println("Initial list of elements: "+ll);  
                  ll.add("Ravi");  
                  ll.add("Vijay");  
                  ll.add("Ajay");  
                  System.out.println("After invoking add(E e) method: "+ll);  
                  //Adding an element at the specific position  
                  ll.add(1, "Gaurav");  
                  System.out.println("After invoking add(int index, E element) method: "+ll);  
                  LinkedList<String> ll2=new LinkedList<String>();  
                  ll2.add("Sonoo");  
                  ll2.add("Hanumat");  
                  //Adding second list elements to the first list  
                  ll.addAll(ll2);  
                  System.out.println("After invoking addAll(Collection<? extends E> c) method: "+ll);  
                  LinkedList<String> ll3=new LinkedList<String>();  
                  ll3.add("John");  
                  ll3.add("Rahul");  
                  //Adding second list elements to the first list at specific position  
                  ll.addAll(1, ll3);  
                  System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+ll);  
                  //Adding an element at the first position  
                  ll.addFirst("Lokesh");  
                  System.out.println("After invoking addFirst(E e) method: "+ll);  
                  //Adding an element at the last position  
                  ll.addLast("Harsh");  
                  System.out.println("After invoking addLast(E e) method: "+ll);  


       /*Java LinkedList example to remove elements*/

       
           ll.add("Ravi");  
           ll.add("Vijay");  
           ll.add("Ajay");  
           ll.add("Anuj");  
           ll.add("Gaurav");  
           ll.add("Harsh");  
           ll.add("Virat");  
           ll.add("Gaurav");  
           ll.add("Harsh");  
           ll.add("Amit");  
           System.out.println("Initial list of elements: "+ll);  
         //Removing specific element from arraylist  
              ll.remove("Vijay");  
              System.out.println("After invoking remove(object) method: "+ll);   
         //Removing element on the basis of specific position  
              ll.remove(0);  
              System.out.println("After invoking remove(index) method: "+ll);   
              LinkedList<String> lll=new LinkedList<String>();  
              lll.add("Ravi");  
              lll.add("Hanumat");  
         // Adding new elements to arraylist  
              ll.addAll(lll);  
              System.out.println("Updated list : "+ll);   
         //Removing all the new elements from arraylist  
              ll.removeAll(lll);  
              System.out.println("After invoking removeAll() method: "+ll);   
         //Removing first element from the list  
              ll.removeFirst();  
              System.out.println("After invoking removeFirst() method: "+ll);  
          //Removing first element from the list  
              ll.removeLast();  
              System.out.println("After invoking removeLast() method: "+ll);  
          //Removing first occurrence of element from the list  
              ll.removeFirstOccurrence("Gaurav");  
              System.out.println("After invoking removeFirstOccurrence() method: "+ll);  
          //Removing last occurrence of element from the list  
              ll.removeLastOccurrence("Harsh");  
              System.out.println("After invoking removeLastOccurrence() method: "+ll);  
  
              //Removing all the elements available in the list       
              ll.clear();  
              System.out.println("After invoking clear() method: "+ll);   
                    
        }  
}
