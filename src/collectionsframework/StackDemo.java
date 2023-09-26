package collectionsframework;

import java.util.Stack;
import java.util.Vector;

public class StackDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("Lavish");
        v.add("Rahul");
        System.out.println("Vector: " + v);
        Stack<String> s = new Stack<String>();
        s.add("Pawan");
        s.add("Shubham");
        s.add(1, "Rahul");
        s.add(2, "Rohit");
        s.add(3, "Raj");
        System.out.println("Stack: " + s);
        s.addAll(v);
        System.out.println("Stack: " + s);
        s.addAll(0, v);
        System.out.println("Stack: " + s);
        System.out.println("S[0]: " + s.get(0));
        System.out.println("S[1]: " + s.get(1));
        System.out.println("S[2]: " + s.get(2));
        System.out.println("contains('Sonu'): " + s.contains("Sonu"));
        System.out.println("containsAll(v): " + s.containsAll(v));
        s.set(0, "Shubham");
        System.out.println("Stack: " + s);
        s.set(1, "Rahul");
        System.out.println("Stack: " + s);
        s.set(2, "Rohit");
        System.out.println("Stack: " + s);
        s.remove(0);
        System.out.println("Stack: " + s);
        s.removeAll(v);
        System.out.println("Stack: " + s);
        s.clear();
        System.out.println("Stack: " + s);

    }
}
