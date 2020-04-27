abstract class Laptop{
    void screen(){
        System.out.println("All laotop do have Screen");
    }
    abstract void storage();
    abstract void price();
}
class MacBook extends Laptop{
    void storage(){
        System.out.println("Starts with SSD of 128GB.");
        }
        void price(){
            System.out.println("Apple laptops are expensive\n");
        }
}
class Dell extends Laptop{
    void storage(){
        System.out.println("Starts with SSD of 256GB");
    }
    void price(){
        System.out.println("Dell laotop are cheap compared to macbook");
    }
}
public class OverRiding{
    public static void main(String args[]){
        Laptop l;
        l = new MacBook();
        l.screen();
        l.storage();
        l.price();
        l = new Dell();
        l.screen();
        l.storage();
        l.price();
        
    }
}