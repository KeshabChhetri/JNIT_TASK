/* 
ListIterator can perform replacement and addition
of new object along with read and remove operation. Also, by using
ListIteratior we can move either to the forward direction 
and backward direction. LI also called bidirectional cursor.
*/


import java.util.*;
public class ListIterationDemo{
    public static void main (String args[]){
        LinkedList l = new LinkedList();
        l.add("Vodka");
        l.add("Whiskey");
        l.add("Rum");
        l.add("Cognac");
        l.add("Tequila");
        l.add("Beer");
    
    System.out.println("Befor using ListIterator: " + l);
    ListIterator ltr = l.listIterator();
    while (ltr.hasNext()){
        String s = (String) ltr.next();
        
        if(s.equals("Rum")){
            ltr.remove ();
        }
        else if (s.equals ("Beer")){
            ltr.add("Wine");
        }
         else if (s.equals ("Cognac")){
            ltr.set("Margarita"); // set () is use to replace
        }
    }
        System.out.println("After ListIteration: " + l);
        
        
    
    }
}