package ArrayList_Impl;

import java.util.ArrayList;

public class ArrayListBasics {

    public static void main(String[] args) {
        ArrayList<String> languageList = new ArrayList<>();

        // Add elements
        languageList.add("Java");  // Adds to the end
        languageList.add(0, "Python");  // Adds at index 0

        //Get programming language names
        String language = languageList.get(0);  // Get language at index 0
        System.out.println("Language at index 0: " + language);  // Python

        //Remove elements
        languageList.remove("Java");  // Removes by language name
        languageList.remove(0);  // Removes by index

        //Set language at a specific index
        languageList.add("C++");
        languageList.set(0, "JavaScript");  // Sets new name at index 0

        //Check if a language exists
        boolean contains = languageList.contains("C++");  // true if exists
        System.out.println("Contains C++? " + contains);

        //Get the size
        int size = languageList.size();
        System.out.println("Number of elements: " + size);

        //Check if the list is empty
        boolean isEmpty = languageList.isEmpty();  // true if list is empty
        System.out.println("Is the list empty? " + isEmpty);

        //Clear the list
        languageList.clear();  // Clears all elements in the list

        //Get index of a language
        languageList.add("Ruby");
        int index = languageList.indexOf("Ruby");  // Returns the index of the first occurrence
        System.out.println("Index of Ruby: " + index);

        //Check if list contains all elements of another list
        ArrayList<String> newLanguages = new ArrayList<>();
        newLanguages.add("Ruby");
        newLanguages.add("JavaScript");
        boolean containsAll = languageList.containsAll(newLanguages);  // Checks if all elements are present
        System.out.println("Contains all new elements? " + containsAll);

        //Remove all elements in the collection
        languageList.removeAll(newLanguages);  // Removes all matching elements

        //Retain elements that are in another collection
        languageList.retainAll(newLanguages);  // Retains only the common elements


        //Sublist of elements
        ArrayList<String> sublist = new ArrayList<>(languageList.subList(0, 2));  // Creates sublist from index 0 to 2
        System.out.println("Sublist of elements: " + sublist);

        //Convert to an array
        String[] array = new String[languageList.size()];
        languageList.toArray(array);  // Converts to array
    }
}

