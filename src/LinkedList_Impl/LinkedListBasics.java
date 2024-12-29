package LinkedList_Impl;

import java.util.LinkedList;

public class LinkedListBasics {

    public static void main(String[] args) {
        LinkedList<String> languageList = new LinkedList<>();

        languageList.add("Java");  // Adds to the end
        languageList.addFirst("Python");  // Adds to the front
        languageList.addLast("C++");  // Adds to the end

        String firstLanguage = languageList.getFirst();  // Get the first language
        String lastLanguage = languageList.getLast();  // Get the last language
        System.out.println("First language: " + firstLanguage);  // Python
        System.out.println("Last language: " + lastLanguage);  // C++

        languageList.remove("Java");  // Removes by name
        languageList.removeFirst();  // Removes the first element
        languageList.removeLast();  // Removes the last element

        languageList.add(1, "JavaScript");  // Adds at index 1

        languageList.set(0, "Ruby");  // Sets new name at index 0

        boolean contains = languageList.contains("C++");  // true if exists
        System.out.println("Contains C++? " + contains);

        int size = languageList.size();
        System.out.println("Number of elements: " + size);

        boolean isEmpty = languageList.isEmpty();  // true if list is empty
        System.out.println("Is the list empty? " + isEmpty);

        LinkedList<String> languagesToRemove = new LinkedList<>();
        languagesToRemove.add("Python");
        languageList.removeAll(languagesToRemove);  // Removes all matching elements

        languageList.retainAll(languagesToRemove);  // Retains only the common elements

        String peekFirst = languageList.peekFirst();  // Retrieves first element
        String peekLast = languageList.peekLast();  // Retrieves last element

        String pollFirst = languageList.pollFirst();  // Removes and retrieves first element
        String pollLast = languageList.pollLast();  // Removes and retrieves last element

        LinkedList<String> moreLanguages = new LinkedList<>();
        moreLanguages.add("Kotlin");
        languageList.addAll(moreLanguages);  // Adds all elements from moreLanguages

        String[] array = new String[languageList.size()];
        languageList.toArray(array);  // Converts to array
    }
}
