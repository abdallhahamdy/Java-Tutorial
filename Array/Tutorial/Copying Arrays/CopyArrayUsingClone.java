public class CopyArrayUsingClone {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = original.clone();

        System.out.println("Original array: " + java.util.Arrays.toString(original));
        System.out.println("Copied array: " + java.util.Arrays.toString(copy));
    }
}
