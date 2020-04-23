class Rectangle{
    String name = "Jhandu";
  
    Rectangle() {   //no arguement default constructor
    System.out.println("This a default constructor.");
    
    }
}
  public class DefauultConstructor{
     public static void main (String ar[]) {
         Rectangle obj = new Rectangle ();
         System.out.println(obj.name);
    }
 }
