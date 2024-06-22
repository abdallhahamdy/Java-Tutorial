import java.time.LocalDate;
import java.util.Arrays;

public class SortingAnArray {

    public static void main(String[] args) {
        // Sorts the specified array into ascending numerical order.
        int[] intArray = { 3, 1, 2, 4 };
        System.out.println("Original Array : " + Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println("Sorted Array : " + Arrays.toString(intArray));

        // Sorts the specified array into ascending numerical order.
        byte[] byteArray = { 1, 3, 2, 1, 5 };
        System.out.println("Original Array : " + Arrays.toString(byteArray));
        Arrays.sort(byteArray);
        System.out.println("Sorted Array : " + Arrays.toString(byteArray));

        // Sorts the specified array into ascending numerical order.
        char[] charArray = { 'a', 'd', 'c','b' };
        System.out.println("Original Array : " + Arrays.toString(charArray));
        Arrays.sort(charArray);
        System.out.println("Sorted Array : " + Arrays.toString(charArray));

        // Sorts the specified array into ascending numerical order.
        double[] doubleArray = { 0.1, 0.3, 0.2 };
        System.out.println("Original Array : " + Arrays.toString(doubleArray));
        Arrays.sort(doubleArray);
        System.out.println("Sorted Array : " + Arrays.toString(doubleArray));

        // Sorts the specified array into ascending numerical order.
        long[] longArray = { 1, 3, 2, 5, 4 };
        System.out.println("Original Array : " + Arrays.toString(longArray));
        Arrays.sort(longArray);
        System.out.println("Sorted Array : " + Arrays.toString(longArray));

        // Sorts the specified array into ascending numerical order.
        float[] floatArray = { 1.1f, 1.5f, 1.4f };
        System.out.println("Original Array : " + Arrays.toString(floatArray));
        Arrays.sort(floatArray);
        System.out.println("Sorted Array : " + Arrays.toString(floatArray));

        String[] strArray = { "abc", "cdf", "pqr" };
        System.out.println("Original Array : " + Arrays.toString(strArray));
        Arrays.sort(strArray);
        System.out.println("Sorted Array : " + Arrays.toString(strArray));

        LocalDate[] dates = { LocalDate.now(), LocalDate.of(2017, 12, 12) };
        System.out.println("Original Array : " + Arrays.toString(dates));
        Arrays.sort(dates);
        System.out.println("Sorted Array : " + Arrays.toString(dates));
    }

}
