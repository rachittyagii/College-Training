package collectionsframework;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(1);
        al1.add(2);
        al1.add(0, 3);
        al1.add(2, 4);
        System.out.println("ArrayList1: " + al1);
        Vector v = new Vector();
        v.add(10);
        v.add(20);
        v.add(30);
        System.out.println("Vector: " + v);
        al1.addAll(v);
        System.out.println("ArrayList1: " + al1);
        al1.addAll(0, v);
        
    }
}
