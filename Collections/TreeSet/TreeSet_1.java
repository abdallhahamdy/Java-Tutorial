import java.util.TreeSet;

public class TreeSet_1 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Orange");
        treeSet.add("Apple");
        treeSet.add("Banana");

        System.out.println("Does the TreeSet contain 'Apple'? " + treeSet.contains("Apple"));
        System.out.println("Does the TreeSet contain 'Grapes'? " + treeSet.contains("Grapes"));
    }
}
