package ArrayList_Impl;

import java.util.*;

//Write a program to find the most frequently occurring element in an ArrayList.
public class MostFrequentElement {

    public static void main(String[] args){
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,1,2,3,1,4,3,5,6,2,1,9));
        if(arrayList.isEmpty())
            System.out.println("List is Empty");
        else {
            /* Below approach has Complexity O(n^2)
             * Because outer loop executes O(n) and Collections.frequency executes bby iterating the list
             * hence it executes O(n)*O(n)
             */
//            int highestFrequency = 0, mostFrequentElement= arrayList.get(0);
//            for (Integer i : arrayList) {
//                if (Collections.frequency(arrayList, i) > highestFrequency){
//                    highestFrequency = Collections.frequency(arrayList, i);
//                    mostFrequentElement = i;
//                    }
//            }
//            System.out.println("Most Frequent Element is : " + mostFrequentElement);

            /* By using hashmap to find the frequency of element, we can avoid the Collections.frequency
             * Hence the Complexity becomes O(n)+O(n) = O(n)
             */
            HashMap<Integer, Integer> frequencyMap = new HashMap<>();
            for(Integer num: arrayList){
                frequencyMap.put(num, frequencyMap.getOrDefault(num,1)+1);
            }
            int highestFrequency = 0, mostFrequentElement= arrayList.get(0);
            for(Integer num: frequencyMap.keySet()){
                if (frequencyMap.get(num) > highestFrequency){
                    highestFrequency = frequencyMap.get(num);
                    mostFrequentElement = num;
                }
            }
            System.out.println("Most Frequent Element is : " + mostFrequentElement);
        }
    }
}
