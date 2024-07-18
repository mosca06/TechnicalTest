package org.algorithms;
import java.util.Stack;

public class Matrix2D {
    private Stack<Integer> stack;
    private char[][] matrix;
    private int matrixLength;
    private int matrixHeight;

    public Matrix2D() {
        stack = new Stack<>();
    }

    public int calculateMaxRectangleArea(char[][] inputMatrix) {
        setMatrix(inputMatrix);

        stack.push(0);
        for(int i = 0; i < matrixHeight; i++) {
            for(int j = 0; j < matrixLength; j++){
                if (!isInterestValue(matrix[i][j])) continue;
                findRectangles(i, j, matrixLength, 1);
            }
        }
        return stack.peek();
    }

    private void setMatrix(char[][] inputMatrix) {
        matrix = inputMatrix;
        matrixHeight = matrix.length;
        matrixLength = matrix[0].length;
    }

    private void findRectangles(int i, int j, int rectangleLength, int height) {
        if (i >= matrixHeight || !isInterestValue(matrix[i][j])) return;
        int lineLength = getRectangleLength(i, j);
        if(lineLength <= rectangleLength) {
            rectangleLength = lineLength;
        }
        addResult(rectangleLength * height);
        findRectangles(i + 1, j, rectangleLength, height + 1);
    }

    private void addResult(int area){
        if (stack.peek() < area) stack.push(area);
    }

    private int getRectangleLength(int i, int j) {
        if (j >= matrixLength || !isInterestValue(matrix[i][j])) return 0;
        return 1 + getRectangleLength(i, j+1);
    }

    private boolean isInterestValue(char matrixValue) {
        return matrixValue == '1';
    }
}
