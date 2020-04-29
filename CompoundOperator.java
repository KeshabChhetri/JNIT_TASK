/* Implementing various Compound Operator */

public class CompoundOperator{
    public static void main (String args[]){
        int a,b; 
        a = 12;
        b = 13;
         System.out.println("Using += operator: " +  (b += a));
        int c,d; 
        c = 25;
        d = 48;
          System.out.println("Using -= operator: " +  (d -= c));
        int e,f; 
        e = 25;
        f = 25;
         System.out.println("Using *= operator: " +  (e *= f));
        
    }
}