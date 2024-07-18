package org.algorithms;

import org.springframework.util.StringUtils;

public class BalancedParenthesesChecker {

    public static int areParenthesesBalanced(String input) {
        int startParentheses = StringUtils.countOccurrencesOf(input, "(");
        int closeParentheses = StringUtils.countOccurrencesOf(input, ")");

        return startParentheses == closeParentheses ? 1 : 0;
    }
}