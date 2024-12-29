package Stack_Impl;

import java.util.Stack;

public class StackBasics {


    public static void main(String[] args) {
        Stack<String> languageStack = new Stack<>();

        // Push languages (add to the top of the stack)
        languageStack.push("Java");
        languageStack.push("Python");
        languageStack.push("C++");

        // Peek (view the top language without removing it)
        String topLanguage = languageStack.peek();
        System.out.println("Top language: " + topLanguage);  // C++

        // Pop (remove and return the top language)
        String poppedLanguage = languageStack.pop();
        System.out.println("Popped language: " + poppedLanguage);  // C++

        // Search (find the position of a language)
        int position = languageStack.search("Python");
        System.out.println("Position of Python: " + position);

        // Check if the stack is empty
        boolean isEmpty = languageStack.isEmpty();
        System.out.println("Is language stack empty? " + isEmpty);

        // Get the size
        int size = languageStack.size();
        System.out.println("Size of the language stack: " + size);

        // Clear the stack
        languageStack.clear();  // Clears all languages in the stack

        // Add all languages from another collection
        Stack<String> moreLanguages = new Stack<>();
        moreLanguages.push("JavaScript");
        languageStack.addAll(moreLanguages);  // Adds all elements from moreLanguages

        // Ensure capacity for the stack
        languageStack.ensureCapacity(50);  // Ensures there is space for 50 more elements
    }
}

