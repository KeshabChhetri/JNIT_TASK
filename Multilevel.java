class Literature{
    void vast(){
        System.out.println("Literature is Vast.");
    }
}
class Fiction extends Literature{
    void novel(){
        System.out.println("TFIOS is a Novel.");
    }
}
class Writer extends Fiction{
    void johnGreen(){
        System.out.println("TFIOS Writer");
    }
}

public class Multilevel{
    public static void main (String args[]){
        Writer W = new Writer();
        W.johnGreen();
        W.novel();
        W.vast();
    }
}