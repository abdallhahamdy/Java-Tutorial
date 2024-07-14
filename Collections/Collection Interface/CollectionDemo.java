import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

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

//        Collection<String> collection = new ArrayList<>();
//        collection.add("Hello");
//        collection.clear();
//        System.out.println(collection.size()); // output: 0

//        Collection<String> collection = new ArrayList<>();
//        collection.add("Hello");
//        boolean contains = collection.contains("Hello");
//        System.out.println(contains);

//        Collection<String> collection1 = new ArrayList<>();
//        Collection<String> collection2 = new ArrayList<>();
//        collection2.add("Hello");
//        collection2.add("World");
//        collection1.add("Hello");
//        collection1.add("World");
//        boolean containsAll = collection1.containsAll(collection2);
//        System.out.println(containsAll);    // Output: true

//    Collection<String> collection = new ArrayList<>();
//    boolean isEmpty = collection.isEmpty();
//        System.out.println(isEmpty);

        Collection<String> collection = new ArrayList<>();
        collection.add("Hello");
        Iterator<String> iterator = collection.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());  // Output: Hello
        }
    }
}
