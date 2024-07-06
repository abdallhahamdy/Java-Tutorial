package Array.Program_1.ReverseArrayInPlace;

public class ReverseArrayInPlace {

    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original Array: ");
        printArray(array);

        // Reverse the array in place
        reverseArray(array);

        // Print the reversed array
        System.out.println("Reversed Array: ");
        printArray(array);
    }

    // Method to reverse the array in place
    public static void reverseArray(int[] array) {
        int left = 0; // Start pointer
        int right = array.length - 1; // End pointer

        while (left < right) {
            // Swap elements at left and right indices
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move the pointers towards the center
            left++;
            right--;
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int element: array) {
            System.out.println(element + " ");
        }
        System.out.println();
    }
}


