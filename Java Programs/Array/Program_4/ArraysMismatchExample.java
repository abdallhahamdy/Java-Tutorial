package Array.Program_4;

import java.util.Arrays;

public class ArraysMismatchExample {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 6};
        int[] array3 = {1, 2, 3, 4, 5};

        int mismatchIndex = Arrays.mismatch(array1, array2);
        System.out.println("First mismatch between array1 and array2: " + mismatchIndex);

        mismatchIndex = Arrays.mismatch(array1, array3);
        System.out.println("First mismatch between array1 and array3: " + mismatchIndex);
    }
}
