import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

    public static void main(String[] args) {

//        Collection<String> fruitCollection = new ArrayList<>();
//        fruitCollection.add("banana");
//        fruitCollection.add("apple");
//        fruitCollection.add("mango");
//        System.out.println(fruitCollection);
//
//        fruitCollection.remove("banana");
//        System.out.println(fruitCollection);
//
//        System.out.println(fruitCollection.contains("apple"));
//
//        fruitCollection.forEach((element) -> {
//            System.out.println(element);
//        });
//
//        fruitCollection.clear();
//
//        System.out.println(fruitCollection);

//        Collection<String> collection = new ArrayList<>();
//        boolean isAdded = collection.add("Hello");
//        System.out.println(isAdded);

//        Collection<String> collection1 = new ArrayList<>();
//        Collection<String> collection2 = new ArrayList<>();
//        collection2.add("Hello");
//        collection2.add("World");
//        boolean isAllAdded = collection1.addAll(collection2);
//        System.out.println(isAllAdded);   // Output: true

        Collection<String> collection = new ArrayList<>();
        collection.add("Hello");
        collection.clear();
        System.out.println(collection.size()); // output: 0
    }
}
