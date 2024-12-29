package Vector_Impl;

import java.util.Vector;

public class VectorBasics {
    public static void main(String[] args) {
        Vector<String> languageList = new Vector<>();

        languageList.add("Java");
        languageList.add(0, "Python");

        // Get language names
        String language = languageList.get(0);  // Get language at index 0
        System.out.println("Language at index 0: " + language);  // Python

        // Remove languages
        languageList.remove("Java");
        languageList.remove(0);  // Removes by index

        // Set language name at a specific index
        languageList.add("JavaScript");
        languageList.set(0, "Ruby");

        // Check if a language exists
        boolean contains = languageList.contains("C++");
        System.out.println("Contains C++? " + contains);

        // Get the size
        int size = languageList.size();
        System.out.println("Number of programming languages: " + size);

        // Check if the list is empty
        boolean isEmptyBeforeClear = languageList.isEmpty();
        System.out.println("Is the list empty before clear? " + isEmptyBeforeClear);  // Should be false

        // Clear the list
        languageList.clear();  // Clears all languages in the list

        // Check if the list is empty after clear
        boolean isEmptyAfterClear = languageList.isEmpty();
        System.out.println("Is the list empty after clear? " + isEmptyAfterClear);  // Should be true

        // Add languages at a specific position
        languageList.add(0, "Java");

        // Convert Vector to Array
        String[] array = new String[languageList.size()];
        languageList.toArray(array);  // Converts to array

        // Add all languages from another collection
        Vector<String> moreLanguages = new Vector<>();
        moreLanguages.add("C#");
        languageList.addAll(moreLanguages);  // Adds all elements from moreLanguages

        // Ensure capacity for the Vector
        languageList.ensureCapacity(20);  // Ensures there is space for 20 more elements

        // Get element at specific index
        String elementAtIndex = languageList.elementAt(0);
        System.out.println("Element at index 0: " + elementAtIndex);
    }

}
