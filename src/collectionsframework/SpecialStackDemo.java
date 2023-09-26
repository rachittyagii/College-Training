package collectionsframework;

import java.util.Stack;

public class SpecialStackDemo {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();
        books.push("Grey");
        books.push(" Red");
        books.push("Blue");
        books.push("Black");
        books.push("White");
        books.push("Pink");
        System.out.println("Stack of books: " + books);
        System.out.println("pop: " + books.pop());
        System.out.println("pop: " + books.pop());
        System.out.println("peeks: "+books.peek());
        System.out.println("Stack of books: " + books);
        System.out.println("search: "+books.search("Red"));

    }

}
