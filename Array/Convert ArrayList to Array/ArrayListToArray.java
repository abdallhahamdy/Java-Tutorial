import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("abc");
        strList.add("xyz");
        strList.add("pqr");
        strList.add("mno");

        /* Conversion using toArray() method */
//        String[] strArr = null;
//
//        strArr = strList.toArray(new String[strList.size()]);
//        System.out.println(Arrays.toString(strArr));

        /* The manual way of Conversion using ArrayList get() method */

        String[] strArr = new String[strList.size()];

        for (int i = 0; i < strList.size(); i++) {
            strArr[i] = strList.get(i);
        }

        /* Displaying Array elements*/
        System.out.println(Arrays.toString(strArr));

    }
}
