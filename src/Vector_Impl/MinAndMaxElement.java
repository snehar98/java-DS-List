package Vector_Impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

// Implement a program to find the maximum and minimum values in a Vector.
public class MinAndMaxElement {

    public static void main(String[] args){
        Vector<Integer> integerVector = new Vector<>(Arrays.asList(10,2,-1,0,5,8,7));
        System.out.println("Maximum element : "+ Collections.max(integerVector));
        System.out.println("Minimum element : "+ Collections.min(integerVector));
    }
}
