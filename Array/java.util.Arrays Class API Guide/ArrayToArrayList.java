import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

    public static void main(String[] args) {
//        String anArrayOfStrings[] = { "Agra", "Mysore", "Chandigarh", "Bhopal"};
//
//        List<String> strList = Arrays.asList(anArrayOfStrings);

        Integer anArrayOfIntegers[] = { 1, 2, 3, 4, 5, 6};

        List<Integer> intList = Arrays.asList(anArrayOfIntegers);

        System.out.println("Original ArrayList from Arrays.asList()");

        /* Display array list */
        intList.forEach(str -> System.out.println(" " + str));

        // change the array element and see the effect is propogated to list
        // also.
        anArrayOfIntegers[0] = -1;

        System.out.println("\nChange in array effect on ArrayList");

        /* Display array list */
        intList.forEach(str -> System.out.println(" " + str));
    }
}
