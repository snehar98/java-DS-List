package ArrayList_Impl;

import java.util.*;

//2. Implement a program to remove duplicates from an ArrayList.
public class RemoveDuplicates {
    public static void main(String[] args){
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,1,2,3,1,4,3,5,6,2,1,9));
        //HashSet<Integer> uniqueElements = new HashSet<>(arrayList); //If order doer doesn't matter
        HashSet<Integer> uniqueElements = new LinkedHashSet<>(arrayList); //Preserves insertion order
        System.out.println(uniqueElements);
    }
}
