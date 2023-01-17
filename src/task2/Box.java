package task2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> list = new LinkedList<>();

    public void add(T value) {
        list.add(value);
    }

    @SafeVarargs
    public final void add(T... values) {
        list.addAll(Arrays.asList(values));
    }

    public float getWeight() {
        float sum = 0;
        for (T value :
                list) {
            sum += value.getWeight();
        }
        return sum;
    }

    public boolean compare(Box anotherBox) {
        return (this.getWeight() == anotherBox.getWeight());
    }

    public void merge(Box<T> anotherBox) {
        this.list.addAll(anotherBox.list);
    }

    public List<T> getList() {
        return list;
    }
}