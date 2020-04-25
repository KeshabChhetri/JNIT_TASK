/*Given two int values, return their sum. 
Unless the two values are the same, then return double their sum.
*/

class Add{
   
    public int num(int a, int b){
       int  sum = a+b;   
      
      if(a!= b){
       System.out.println("Sum is " + sum);
      }
    
     if (a == b){
        sum = sum *2;
        System.out.println("Sum is  " +sum);
        
    }
    return sum;
    
    }
}

public class sumDouble{
    public static void main(String args[]){
    Add  s = new Add();
        s.num (2,3);
    }
}