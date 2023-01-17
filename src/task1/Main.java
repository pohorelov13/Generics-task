package task1;

public class Main {

    public static void main(String[] args) {
        String[] arr = {"Create", "new", "list"};

        Task1<String> task = new Task1<>();
        System.out.println(task.toList(arr));
    }
}
