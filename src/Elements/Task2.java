package Elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        String[] arrayOfStrings = {"Mouse", "Elephant", "Bananas", "Apple"};
        List<String> listOfStrings = masToArray(arrayOfStrings);
        System.out.println(listOfStrings);

        Integer[] arrayOfInteger = {1,2,3,4,5};
        List<Integer> listOfInteger = masToArray(arrayOfInteger);
        System.out.println(listOfInteger);
    }

    static <T> ArrayList<T> masToArray(T[] mas) { //<T> - Type

        final ArrayList<T> result = new ArrayList<>(Arrays.asList(mas));

        return result;
    }

}