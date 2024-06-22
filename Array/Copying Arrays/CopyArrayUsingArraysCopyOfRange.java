public class CopyArrayUsingArraysCopyOfRange {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = java.util.Arrays.copyOfRange(original, 1, 4); // Copies elements from index 1 to 3

        System.out.println("Original array: " + java.util.Arrays.toString(original));
        System.out.println("Copied array: " + java.util.Arrays.toString(copy));
    }
}
