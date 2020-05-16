import java.util.*;

public class IterationDemo{
    public static void main (String args[]){
        ArrayList al = new ArrayList();
        for (int i =0; i<=10; i++){
            al.add(i);
        }
        System.out.println("Before Iteration: " + al);
        Iterator itr = al.iterator();
        while (itr.hasNext()){
            Integer I = (Integer) itr.next();
            if(I % 3 == 0)
            System.out.println("After Iteration : " + I);
            else
            itr.remove();
        }
    }
}