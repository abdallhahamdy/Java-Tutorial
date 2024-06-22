import java.util.Arrays;

public class SearchingArray {

    public static void main(String[] args) {

        // Searches the specified array for the specified String using the
        // binary search algorithm
        final String key = "abc";
        String[] strArray = { "abc", "cdf", "pqr" };
        int index = Arrays.binarySearch(strArray, key);
        System.out.println(" String key found at index : " + index);

        // Searches the specified array of ints for the specified value using
        // the binary search algorithm
        int[] intArray = { 1, 2, 3, 4 };
        index = Arrays.binarySearch(intArray, 3);
        System.out.println(" String key found at index : " + index);

        // Searches the specified array of bytes for the specified value using
        // the binary search algorithm
        byte k = 1;
        byte[] byteArray = { 1, 2, 3, 4, 5 };
        Arrays.binarySearch(byteArray, k);

        // Searches the specified array of chars for the specified value using
        // the binary search algorithm
        char Charkey = 'a';
        char[] charArray = { 'a', 'b', 'c' };
        Arrays.binarySearch(charArray, Charkey);

        // Searches the specified array of longs for the specified value using
        // the binary search algorithm.
        long[] longArray = { 1, 2, 3, 4, 5 };
        Arrays.binarySearch(longArray, 1);

        // Searches the specified array of floats for the specified value using
        // the binary search algorithm
        float[] floatArray = { 1, 2, 3, 4, 5 };
        Arrays.binarySearch(floatArray, 2);

    }
}
