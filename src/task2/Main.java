package task2;

public class Main {

    public static void main(String[] args) {
        Orange orange = new Orange();
        Apple apple = new Apple();

        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Orange> anotherOrangeBox = new Box<>();


        orangeBox.add(orange, orange, orange);
        appleBox.add(apple);
        anotherOrangeBox.add(orange, orange);

        System.out.println(orangeBox.getList());
        System.out.println(appleBox.getList());

        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.getWeight());

        System.out.println(orangeBox.compare(appleBox));

        orangeBox.merge(anotherOrangeBox);
        System.out.println(orangeBox.getList());
    }
}