/*Given two non-negative int values, return true if 
they have the same last digit, such as with 27 and 57. 
Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
*/

class Test{
    public void check(int a, int b){
        if(a % 10 == b % 10  ){
        System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}

public class Main{
    public static void main(String args[]){
        Test t = new Test();
        t.check(5,15);
        
    }
}