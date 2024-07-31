package LambdaExpressionWithCollections;

import java.util.TreeSet;

public class Demo4 {
    public static void main(String[] args) {

        // Pass a reverse comparator to TreeSet() via a lambda expression
        TreeSet<String> ts = new TreeSet<String>((aStr, bStr) -> bStr.compareTo(aStr));

        // Add elements to the TreeSet
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("D");
        ts.add("E");
        ts.add("F");
        ts.add("G");

        // Display the elements
        for (String element : ts)
            System.out.println(element + " ");
        System.out.println();
    }
}
