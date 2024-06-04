import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

    public static void main(String[] args) {
        String anArrayOfStrings[] = { "Agra", "Mysore", "Chandigarh", "Bhopal"};

        List<String> strList = Arrays.asList(anArrayOfStrings);

        System.out.println("Original ArrayList from Arrays.asList()");

        /* Display array list */
        strList.forEach(str -> System.out.println(" " + str));

        // change the array element and see the effect is propogated to list
        // also.
        anArrayOfStrings[0] = "Dehli";

        System.out.println("\nChange in array effect on ArrayList");

        /* Display array list */
        strList.forEach(str -> System.out.println(" " + str));
    }
}
