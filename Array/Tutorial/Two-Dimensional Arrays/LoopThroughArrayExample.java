public class LoopThroughArrayExample {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Using nested for loops
        System.out.println("Using nested for loops:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Using nested for each loops
        System.out.println("Using nested for-each loops:");
        for (int[] row : matrix) {
            for (int element: row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}