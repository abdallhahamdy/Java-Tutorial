package Array.Program_3;

public class LargestNumberFinder {
    public static void main(String[] args) {
        int[] arr = {25, 47, 33, 56, 19, 40};

        int largest = findLargest(arr);

        System.out.println("The largest number in the array is: " + largest);
    }

    public static int findLargest(int[] numbers) {
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}
