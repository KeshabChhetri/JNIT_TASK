class Student{
    void study(){
        System.out.println("Student studies.");
    }
}
class Topper extends Student{
    void betterKnowledge(){
        System.out.println("Whoever study thoroughly grasp better Knowledge.");
    }
}
public class Single{
    public static void main (String args[]){
        Topper T = new Topper();
        T.betterKnowledge();
        T.study();
    }
}