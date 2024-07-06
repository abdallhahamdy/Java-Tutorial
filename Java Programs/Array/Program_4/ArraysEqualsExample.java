package Array.Program_4;

import java.util.Arrays;

public class ArraysEqualsExample {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {5, 4, 3, 2, 1};

        // boolean isEqual = Arrays.equals(array1, array2);
        boolean isEqual = areArraysEqual(array1, array2);
        System.out.println("Array1 equals Array2: " + isEqual);

        // isEqual = Arrays.equals(array1, array3);
        isEqual = areArraysEqual(array1, array3);
        System.out.println("Array1 equals Array3: " + isEqual);
    }

    public static boolean areArraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}
