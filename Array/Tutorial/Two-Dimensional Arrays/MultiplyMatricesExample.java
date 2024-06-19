public class MultiplyMatricesExample {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrix2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        int[][] product = multiplyMatrices(matrix1, matrix2);

        System.out.println("Product of matrices:");
        for (int[] row : product) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int row1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;

        int[][] product = new int[row1][cols2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; j < cols1; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return product;
    }
}