import java.util.Collections;
import java.util.List;

public class Task2 {
    static String pair(List<Integer> list, int sum) {
        Collections.sort(list);
        var sb = new StringBuilder();
        var size = list.size();
        var cut = 0;

        for (var left : list) {
            for (var i = size - 1; 0 < i; i--) {
                var right = list.get(i - cut);
                if (left > right) {
                    return sb.toString();
                }
                if (left + right == sum) {
                    sb.append(left).append(" ").append(right).append("\n");
                    break;
                }
                if (left + right > sum) {
                    cut++;
                    i++;
                    continue;
                }
                break;
            }
        }
        return sb.toString();
    }

}
