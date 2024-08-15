import java.util.EnumSet;

public class EnumSetExample_1 {

    // Define an 'enum'
    enum Colors {
        RED, GREEN, BLUE, YELLOW, ORANGE;
    }

    public static void main(String[] args) {

        // 1. Create an empty EnumSet
        EnumSet<Colors> colorSet = EnumSet.noneOf(Colors.class);
        System.out.println("1. Empty EnumSet: " + colorSet);

        // 2. Add single elements
        colorSet.add(Colors.RED);
        colorSet.add(Colors.BLUE);
        System.out.println("2. EnumSet after adding RED and BLUE: " + colorSet);

        // 3. Add multiple elements using EnumSet.of()
        EnumSet<Colors> yellowAndOrange = EnumSet.of(Colors.YELLOW, Colors.ORANGE);
        System.out.println("3. EnumSet of YELLOW and ORANGE: " + yellowAndOrange);

        // 4. Create an EnumSet of all elements
        EnumSet<Colors> allColors = EnumSet.allOf(Colors.class);
        System.out.println("4. EnumSet of all colors: " + allColors);

        // 5. Remove an element
        allColors.remove(Colors.GREEN);
        System.out.println("5. EnumSet after removing GREEN: " + allColors);
    }
}
