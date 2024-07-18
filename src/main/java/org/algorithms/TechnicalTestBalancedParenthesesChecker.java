package org.algorithms;

public class TechnicalTestBalancedParenthesesChecker {
    public static void main(String[] args) {
        String string1 = "(hello (world))";
        String string2 = "((hello (world))";
        String string3 = "hello world";

        System.out.println(BalancedParenthesesChecker.areParenthesesBalanced(string1));
        System.out.println(BalancedParenthesesChecker.areParenthesesBalanced(string2));
        System.out.println(BalancedParenthesesChecker.areParenthesesBalanced(string3));
    }
}
