package Stack_Impl;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression");
        String expr = sc.nextLine();
        if (isBalancedParanthesis(expr))
            System.out.println("Balanced Parenthesis");
        else
            System.out.println("Unbalanced Parenthesis");
    }

    public static boolean isBalancedParanthesis(String expr){
        Stack<Character> stringStack = new Stack<>();

        for(char ch: expr.toCharArray()){
            if(ch=='{' || ch=='[' || ch=='(')
                stringStack.push(ch);
            else {
              if (!stringStack.isEmpty() && !isMatchingPair(ch,stringStack.peek()) )
                 stringStack.pop();
              else
                  return false;
            }
        }

        return stringStack.isEmpty();
    }

    public static boolean isMatchingPair(char open, char close){
        return ((open=='{' && close=='}')
                ||  (open=='[' && close==']') || (open=='(' && close==')'));
    }
}
