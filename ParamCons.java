class Rectangle{
    int length, width, res;
    Rectangle (int x, int y){
        length = x;
        width = y;
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
  public class ParamCons{
     public static void main (String ar[]) {
         Rectangle obj = new Rectangle (10, 20);
         obj.RectArea();
         obj.RectPerim();
         
    }
 }
