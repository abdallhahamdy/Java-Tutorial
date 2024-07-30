package sortedOrderedLinearSearch;

public class LinearSearch {

    public static final int orderedLinearSearch(int value, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                return i;
            }
            else if (array[i] > value) {
                return -1;
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        int[] sortedArray = {10,20,30,40,50};
        // the element that should be found
        int key = 30;

        int atIndex = LinearSearch.orderedLinearSearch(key, sortedArray);

        System.out.println(String.format("Should be found: %d. Found %d at index %d. An array length %d",
                key, sortedArray[atIndex], atIndex, sortedArray.length));
    }
}
