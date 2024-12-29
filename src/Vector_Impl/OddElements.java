package Vector_Impl;

import java.util.Arrays;
import java.util.Vector;

// Write a program to remove even elements from a Vector
public class OddElements {
    public static void main(String[] args) {
        Vector<Integer> integerVector = new Vector<>(Arrays.asList(10, 2, -1, 0, 5, 8, 7));
        integerVector.removeIf(num -> num%2==0);
        System.out.println(integerVector);
    }
}
