import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        // 1. Initialization
        List<String> cowList = new CopyOnWriteArrayList<>();
        System.out.println("Initialized list: " + cowList);

        // 2. Adding elements
        cowList.add("Apple");
        cowList.add("Banana");
        cowList.add("Cherry");
        System.out.println("After adding elements: " + cowList);

        // 3. Remove an element
        cowList.remove("Banana");
        System.out.println("After removing Banana: " + cowList);

        // 4. Iterate over the list
        Iterator<String> iterator = cowList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 5. Add element during iteration
        for (String item : cowList) {
            if ("Apple".equals(item)) {
                cowList.add("Dragonfruit");
            }
            System.out.println(item);
        }

        System.out.println("After adding Dragonfruit during iteration: " + cowList);
    }
}