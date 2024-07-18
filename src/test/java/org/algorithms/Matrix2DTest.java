package org.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Matrix2DTest {

    @Test
    public void testCalculateMaxRectangleArea() {
        char[][] matrix1 = {
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}
        };

        char[][] matrix2 = {
                {'0','0','0','0'},
                {'0','0','0','0'},
                {'0','0','0','0'}
        };

        char[][] matrix3 = {
                {'1','1','1'},
                {'1','1','1'},
                {'1','1','1'}
        };

        char[][] matrix4 = {
                {'0', '1', '0', '1', '0', '1', '1'},
                {'1', '1', '1', '0', '1', '1', '1'},
                {'1', '1', '1', '0', '1', '1', '1'},
                {'1', '0', '1', '1', '1', '1', '1'},
                {'1', '1', '1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '0', '0', '0'},
                {'1', '1', '1', '1', '0', '0', '0'}
        };

        Matrix2D matrix2D = new Matrix2D();

        int result1 = matrix2D.calculateMaxRectangleArea(matrix1);
        int result2 = matrix2D.calculateMaxRectangleArea(matrix2);
        int result3 = matrix2D.calculateMaxRectangleArea(matrix3);
        int result4 = matrix2D.calculateMaxRectangleArea(matrix4);

        assertEquals(6, result1);
        assertEquals(0, result2);
        assertEquals(9, result3);
        assertEquals(12, result4);
    }
}
