package task1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Task1<T> {

    List<T> toList(T[] arr) {
        return new LinkedList<>(Arrays.asList(arr));
    }
}
