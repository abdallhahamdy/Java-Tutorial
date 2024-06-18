import java.util.ArrayList;
import java.util.Collections;

public class ConvertArrayToArrayListUsingAddAll {
    public static void main(String[] args) {
        String[] array = {"A", "B", "C"};

        // Create a new ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Add all elements from the array to the ArrayList using Collections.addAll()
        Collections.addAll(arrayList, array);

        // Print the ArrayList
        System.out.println("ArrayList: " + arrayList);
    }
}
