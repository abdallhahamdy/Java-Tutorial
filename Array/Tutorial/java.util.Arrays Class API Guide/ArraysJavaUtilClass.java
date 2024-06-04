import java.util.Arrays;

public class ArraysJavaUtilClass {

    public static void main(String[] args) {
        // Sorts the specified array into ascending numerical order.
        int[] intArray = { 3, 1, 2, 4 };
        System.out.println(" int Array toString : " + Arrays.toString(intArray));

        // Sorts the specified array into ascending numerical order.
        byte[] byteArray = { 1, 3, 2, 1, 5 };
        System.out.println(" byte Array toString : " + Arrays.toString(byteArray));

        // Sorts the specified array into ascending numerical order.
        char[] charArray = { 'a', 'd', 'c', 'b' };
        System.out.println(" char Array toString : " + Arrays.toString(charArray));

        // Sorts the specified array into ascending numerical order.
        double[] doubleArray = { 0.1, 0.3, 0.2 };
        System.out.println(" double Array toString : " + Arrays.toString(doubleArray));

        // Sorts the specified array into ascending numerical order.
        long[] longArray = { 1, 3, 2, 5, 4 };
        System.out.println(" long Array toString : " + Arrays.toString(longArray));

        // Sorts the specified array into ascending numerical order.
        float[] floatArray = { 1.1f, 1.5f, 1.4f };
        System.out.println(" float Array toString : " + Arrays.toString(floatArray));

        String[] strArray = { "abc", "cdf", "pqr" };
        System.out.println("string Array toString : " + Arrays.toString(strArray));
    }
}
