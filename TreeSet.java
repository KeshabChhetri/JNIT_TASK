import java.util.*;
public class TreeSet{
    public static void main(String args[]){
        TreeSet <String> sh = new TreeSet <> ();
        sh.add("K");
        sh.add("E");
        sh.add("S");
        sh.add("H");
        sh.add("A");
        sh.add("B");
        sh.add("C");
        sh.add("H");
        sh.add("H");
        sh.add("E");
        sh.add("T");
        sh.add("R");
        sh.add("I");
        System.out.println("Inserted elements: " + sh);
        System.out.println("first() returns very first english alphabets from the inserted elemnts: " + sh.first());
        System.out.println("last() returns very last english alphabets from the inserted elemnts: " + sh.last());
        System.out.println("pollFirst() removes very first english alphabets from the inserted elemnts: " + sh.pollFirst());
        System.out.println("pollLast() removes very last english alphabets from the inserted elemnts: " + sh.pollLast());
        System.out.println(sh);
    }
}