public class DeepCopyMultidimensionalArray {
    public static void main(String[] args) {
        int[][] original = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] copy = new int[original.length][];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i].clone();
        }

        // Modifying the original array to demonstrate deep copy
        original[0][0] = 90;

        System.out.println("Original array:");
        printArray(original);
        System.out.println("Copied array:");
        printArray(copy);
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(java.util.Arrays.toString(row));
        }
    }
}
