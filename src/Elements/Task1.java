package Elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("Dog","Sheep","Cat","Fish"));
        System.out.println("Original word list: " + strings);
        removeElements(strings,0,2);

        List<Integer> integers = new ArrayList<>(Arrays.asList(100,200,300,400,500));
        System.out.println("Initial list of numbers:" + integers);
        removeElements(integers,0,4);
    }

    private static void removeElements(List list,final int first, final int second) throws IndexOutOfBoundsException{ //бросаем ошибку, если вышли за границы листа
        Collections.swap(list,first,second);
        System.out.println("After completing replacement of items: " + list);
    }
}
