class MethodOverloading{
    int a,b;
   void calc (int x){
        a = x;
        System.out.println("Square is " + (a * a));
    }

   void calc(int x, int y){
        a = x;
        b = y;
        System.out.println("Addition is " + (a + b));
    }
}

public class MO{
    public static void main (String[] args){
        MethodOverloading MO = new MethodOverloading();
        MO.calc(5);
        MO.calc(20,15);
        
    }
}