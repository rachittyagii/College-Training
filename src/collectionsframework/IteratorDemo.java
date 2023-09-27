package collectionsframework;
import java.util.Iterator;
import java.util.LinkedList;
public class IteratorDemo {
    public static void main(String args[])
    {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.addLast(40);
        list.addFirst(20);
        list.add(80);
        list.addLast(70);
        list.addFirst(90);
        list.add(60);
        System.out.println("Linked List :"+list);
        Iterator<Integer> it=list.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next()+"");
        }
    }
}