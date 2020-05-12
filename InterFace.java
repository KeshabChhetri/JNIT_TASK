interface Electronics{
    void battery();
    void cost();
}
abstract class Mobile implements Electronics{
    void camera(){
        System.out.println("All Mobile possess quality camera");
    }
}
abstract class Laptop implements Electronics{
    void ssd(){
        System.out.println("All laptop have SSD as storage");
        
    }
}
class OnePlus extends Mobile{
    public void battery(){
        System.out.println("Battery last for Average duration");
    }
    public void cost(){
        System.out.println("OnePlus is Affordable");
        }
 }
 class Iphone extends Mobile{
    public void battery(){
        System.out.println("Battery last long");
    }
    public void cost(){
        System.out.println("Iphone is Costly");
        }
 }
 
 class Dell extends Laptop{
     public void battery(){
         System.out.println("Dell have 9-cell Li battery");
     }
     public void cost(){
         System.out.println("Dell range between $500 - $2700");
     }
 }
 class HP extends Laptop{
     public void battery(){
         System.out.println("HP also have 9-cell Li battery");
     }
     public void cost(){
         System.out.println("HP range between $300 - $1500");
     }
}
public class InterFace{
    public static void main (String args[]){
        Mobile M = new OnePlus();
        M.battery();
        M.cost();
        M.camera();
        M = new Iphone();
        M.battery();
        M.cost();
        M.camera();
        Laptop L = new Dell();
        L.battery();
        L.cost();
        L.ssd();
        L = new HP();
        L.battery();
        L.cost();
        L.ssd();
        
    }
}