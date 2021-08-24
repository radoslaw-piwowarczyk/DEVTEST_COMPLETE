import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {
    static void method1(List<Integer> list) {
        var numberOfElementsInTheSource = list.size();
        Set<Integer> treeSet = new TreeSet<>(list);
        var numberOfDistinctElements = treeSet.size();
        var minElement = Collections.min(treeSet);
        var maxElement = Collections.max(treeSet);
        treeSet.forEach(obj -> System.out.print(obj + " "));
        System.out.println();
        System.out.println("count: " + numberOfElementsInTheSource);
        System.out.println("distinct: " + numberOfDistinctElements);
        System.out.println("min: " + minElement);
        System.out.println("max: " + maxElement);
    }
}
