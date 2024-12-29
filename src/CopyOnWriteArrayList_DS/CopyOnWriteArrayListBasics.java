package CopyOnWriteArrayList_DS;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListBasics {

    /**
     * Cheat Sheet for CopyOnWriteArrayList operations.
     * Includes all the basic and important operations for CopyOnWriteArrayList.
     * Operations demonstrate managing elements.
     *
     * @author sneharavikumartl
     */
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> languageList = new CopyOnWriteArrayList<>();

        // Add elements
        languageList.add("Java");  // Adds to the end
        languageList.add(0, "Python");  // Adds at index 0

        // Get element names
        String language = languageList.get(0);  // Get element at index 0
        System.out.println("Language at index 0: " + language);  // Python

        // Remove elements
        languageList.remove("Java");  // Removes by element name
        languageList.remove(0);  // Removes by index

        // Set element at a specific index
        languageList.add("C++");
        languageList.set(0, "JavaScript");  // Sets new name at index 0

        // Check if an element exists
        boolean contains = languageList.contains("C++");  // true if exists
        System.out.println("Contains C++? " + contains);

        // Get the size
        int size = languageList.size();
        System.out.println("Number of elements: " + size);

        // Check if the list is empty
        boolean isEmpty = languageList.isEmpty();  // true if list is empty
        System.out.println("Is the list empty? " + isEmpty);

        // Clear the list
        languageList.clear();  // Clears all languages in the list

        // Get index of a language
        languageList.add("Ruby");
        int index = languageList.indexOf("Ruby");  // Returns the index of the first occurrence
        System.out.println("Index of Ruby: " + index);

        // Check if list contains all elements of another list
        CopyOnWriteArrayList<String> newLanguages = new CopyOnWriteArrayList<>();
        newLanguages.add("Ruby");
        newLanguages.add("JavaScript");
        boolean containsAll = languageList.containsAll(newLanguages);  // Checks if all languages are present
        System.out.println("Contains all new languages? " + containsAll);

        // Remove all elements in the collection
        languageList.removeAll(newLanguages);  // Removes all matching elements

        // Retain languages that are in another collection
        languageList.retainAll(newLanguages);  // Retains only the common languages

        // Sublist of elements
        languageList.add("Go");
        languageList.add("Kotlin");
        CopyOnWriteArrayList<String> sublist = new CopyOnWriteArrayList<>(languageList.subList(0, 2));  // Creates sublist from index 0 to 2
        System.out.println("Sublist of languages: " + sublist);

        // Convert to an array
        String[] array = new String[languageList.size()];
        languageList.toArray(array);  // Converts to array
        System.out.println("Array representation: ");
        for (String lang : array) {
            System.out.println(lang);
        }

        // Add an element if it does not exist (since it's thread-safe)
        languageList.addIfAbsent("Swift");  // Adds "Swift" if it's not already in the list
        System.out.println("List after addIfAbsent: " + languageList);

        // Iterate safely during modifications
        // CopyOnWriteArrayList allows iteration while modifications happen in another thread without concurrent modification exceptions.
        languageList.add("Rust");
        for (String lang : languageList) {
            System.out.println("Iterating language: " + lang);
        }
    }

}
