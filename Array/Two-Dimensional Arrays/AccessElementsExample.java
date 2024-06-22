public class AccessElementsExample {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Accessing elements
        int element = matrix[1][2]; // Accesses the element in the second row, third column (value is 6)
        System.out.println("Element at (1,2): " + element);

        // Modifying elements
        matrix[0][0] = 10; // Changes the element in the first row, first column to 10
        System.out.println("Modified element at (0,0): " + matrix[0][0]);
    }
}
