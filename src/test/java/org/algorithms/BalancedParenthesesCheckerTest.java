package org.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BalancedParenthesesCheckerTest {

    @Test
    public void testBalancedParentheses() {
        assertEquals(1, BalancedParenthesesChecker.areParenthesesBalanced("(())"));
        assertEquals(1, BalancedParenthesesChecker.areParenthesesBalanced("()()"));
        assertEquals(1, BalancedParenthesesChecker.areParenthesesBalanced("((()))"));
    }

    @Test
    public void testUnbalancedParentheses() {
        assertEquals(0, BalancedParenthesesChecker.areParenthesesBalanced("(()"));
        assertEquals(0, BalancedParenthesesChecker.areParenthesesBalanced("())"));
        assertEquals(0, BalancedParenthesesChecker.areParenthesesBalanced("()("));
    }

    @Test
    public void testNoParentheses() {
        assertEquals(1, BalancedParenthesesChecker.areParenthesesBalanced(""));
        assertEquals(1, BalancedParenthesesChecker.areParenthesesBalanced("abc123"));
    }
}
