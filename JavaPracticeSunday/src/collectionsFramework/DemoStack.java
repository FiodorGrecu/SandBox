package collectionsFramework;

import java.util.Stack;

public class DemoStack {
    public static void main(String[] args) {

        Stack<String> booksStack = new Stack<>();

        //push elements

        booksStack.push("Java");
        booksStack.push("SQL");
        booksStack.push("Selenium");
        booksStack.push("API");

        System.out.println(booksStack);

        // Accessing the element on top of the stack
        System.out.println("Top Element: " + booksStack.peek()); // API

        // removing from the Stack
        System.out.println("Remove  Top Element : " + booksStack.pop());

        System.out.println("Top Element: " + booksStack.peek()); // Selenium

        booksStack.pop();
        booksStack.pop();

        System.out.println("Top Element: " + booksStack.peek()); // Java

        System.out.println("Check if we haev value: " + booksStack.isEmpty()); // false
    }
}
