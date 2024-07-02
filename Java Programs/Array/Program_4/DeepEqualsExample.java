package Array.Program_4;

import java.util.Arrays;

public class DeepEqualsExample {
    public static void main(String[] args) {

        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrix3 = {
            {7, 6, 9},
            {10, 11, 12}
        };

        boolean isEqual = Arrays.deepEquals(matrix1, matrix2);
        System.out.println("Matrix equal Matrix2: " + isEqual);

        isEqual = Arrays.deepEquals(matrix1, matrix3);
        System.out.println("Matrix1 equals Matrix3: " + isEqual);
    }
}
