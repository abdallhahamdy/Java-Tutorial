import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertArrayToArrayList {
    public static void main(String[] args) {
        String[] array = {"A", "B", "C"};

        // Method 1: Using Arrays.asList()
        List<String> list = Arrays.asList(array);
        ArrayList<String> arrayList1 = new ArrayList<>(list);
        System.out.println("ArrayList (Arrays.asList): " + arrayList1);

        // Method 2: Using a loop
        ArrayList<String> arrayList2 = new ArrayList<>();
        for (String element : array) {
            arrayList2.add(element);
        }
        System.out.println("ArrayList (Loop): " + arrayList2);

        // Method 3: Using Collections.addAll()
        ArrayList<String> arrayList3 = new ArrayList<>();
        Collections.addAll(arrayList3, array);
        System.out.println("ArrayList (Collections.addAll): " + arrayList3);
    }
}
