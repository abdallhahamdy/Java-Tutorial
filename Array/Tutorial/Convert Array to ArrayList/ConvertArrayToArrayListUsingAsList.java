import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToArrayListUsingAsList {
    public static void main(String[] args) {
        String[] array = {"A", "B", "C"};

        // Convert array to list using Arrays.asList()
        List<String> list = Arrays.asList(array);

        // Convert list to ArrayList to allow modifications
        ArrayList<String> arrayList = new ArrayList<>(list);

        // print the ArrayList
        System.out.println("ArrayList: " + arrayList);
    }
}
