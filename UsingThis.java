class Rectangle{
    int length, width, res;
    Rectangle (int length, int width){
      this.length = length;
        this.width = width;
    }
    void RectArea(){
        res = length * width;
        System.out.println("Area of Rectangle is " + res);
    }
    void RectPerim(){
        res= length + width;
        System.out.println("Perimeter of Rectsngle is " + res);
    }
    
    
}
  public class UsingThis{
     public static void main (String ar[]) {
         Rectangle obj = new Rectangle (10, 20);
         obj.RectArea();
         obj.RectPerim();
         
    }
 }
