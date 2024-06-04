import java.util.Arrays;

public class FillingValuesInArray {

    public static void main(String[] args) {
        // Assigns the specified int value to each element of the specified
        // array of ints.
        int[] fillArray = new int[5];
        System.out.printf("fillArray (before): %s\n", Arrays.toString(fillArray));
        Arrays.fill(fillArray, 1);
        System.out.printf("fillArray (after): %s", Arrays.toString(fillArray));

    }
}
