import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Task1.method1(new ArrayList<>(List.of(1, 2, 10, 7, 5, 3, 6, 6, 13, 0)));
        System.out.println(Task2.pair(new ArrayList<>(List.of(1, 2, 10, 7, 5, 3, 6, 6, 13, 0)), 13));
        var myMap1 = new Task3.MyMap(2, 3);
        var myMap2 = new Task3.MyMap(5, 6);
        var myMap3 = new Task3.MyMap(3, 4);
        var myMap4 = new Task3.MyMap(6, 7);
        var myMap5 = new Task3.MyMap(8, 9);

        System.out.println(Task3.task3(5, myMap1, myMap2, myMap3, myMap4, myMap5));
    }
}
