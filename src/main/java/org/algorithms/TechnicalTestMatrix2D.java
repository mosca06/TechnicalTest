package org.algorithms;

public class TechnicalTestMatrix2D {
    public static void main(String[] args) {
        char[][] inputMatrix = {
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}
        };

        Matrix2D matrix2D = new Matrix2D();
        int highestArea = matrix2D.calculateMaxRectangleArea(inputMatrix);
        System.out.println("Highest rectangle area = " + highestArea);
    }
}
