package task2;

public abstract class Fruit {
   protected float weight;
   protected String name;

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}