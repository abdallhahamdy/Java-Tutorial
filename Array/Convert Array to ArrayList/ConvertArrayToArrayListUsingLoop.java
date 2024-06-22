import java.util.ArrayList;

public class ConvertArrayToArrayListUsingLoop {
    public static void main(String[] args) {
        String[] array = {"A", "B", "C"};

        // Create a new ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Add elements from the array to the ArrayList using a loop
        for (String element : array) {
            arrayList.add(element);
        }

        // Print the ArrayList
        System.out.println("ArrayList: " + arrayList);
    }
}
