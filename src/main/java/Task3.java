import java.util.Arrays;

public class Task3 {
    static int task3(int n, MyMap... lines) {
        Arrays.sort(lines);
        var count = 1;
        var temp = lines[0].right;

        for (int i = 1; i < n; i++) {
            if (temp != lines[i].left) {
                count++;
            }
            temp = lines[i].right;
        }
        return count;
    }

    static class MyMap implements Comparable<MyMap> {
        int left;
        int right;

        public MyMap(int left, int right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public int compareTo(MyMap o) {
            return left - o.left;
        }

        @Override
        public String toString() {
            return left + " " + right;
        }
    }
}
