class C{
     void cLang(){
        System.out.println("C has influnced numerous programming language.");
    }
}
class Java extends C{
    void javaLang(){
        System.out.println("Java is influnced by C programming language.");
    }
}
class Cpp extends C{
    void cppLang(){
        System.out.println("CPP is influnced by programming language.");
    }
}

public class Hierarchical{
    public static void main (String args[]){
        C lang = new Java();
        lang.cLang();
        Java jlang = new Java();
        jlang.javaLang();
        Cpp cpp = new Cpp();
        cpp.cppLang();
        
        
    } 
}