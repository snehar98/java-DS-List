package ArrayList_Impl;

import java.util.*;

// Write a program to sort an ArrayList of integers in ascending and descending order.
public class ArrayListSorting {
    public static void main(String[] args) {

        /* Sorting uses Collections.sort() which internally uses TimSort
        (a hybrid sorting algorithm with O(n log n) complexity
        in both ascending and descending orders).
         */

        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 2, 3, 1, 4, 3, 5, 6, 2, 1, 9));
        Collections.sort(arrayList); //arrayList.sort() - for Java 8
        System.out.println("ArrayList in ascending order : "+arrayList);
        Collections.sort(arrayList, Comparator.reverseOrder());
        System.out.println("ArrayList in descending order : "+arrayList);

    }
}