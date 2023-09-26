package collectionsframework;

import java.util.Vector;

public class VectorPractice {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>(20);
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        int sum = 0;
        for (int i = 0; i < v.size(); i++) {
            sum = sum + (int) v.get(i);
        }
        System.out.println("Sum: " + sum);

    }
}
