class Nesting {
    int a, b;
    Nesting(int x, int y){
        a=x ;
        b=y;
    }
    int greatest(){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    void result(){
        int ans = greatest();
        System.out.println(ans + " is largest." );
    }
}
public class NestingMethod{
    public static void main (String args[]){
        Nesting nes = new Nesting(20,40);
        nes.result ();
    }
}