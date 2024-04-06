import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            queue.offer(i + 1);
        }

        while (queue.size() > 1) {
            queue.poll();
            queue.offer(queue.poll());
        }

        System.out.println(queue.poll());
    }

}
