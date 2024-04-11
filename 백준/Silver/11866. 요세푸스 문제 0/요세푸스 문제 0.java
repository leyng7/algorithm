import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();

        Queue<Integer> queue = new LinkedList<>();

        int n = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        int count = 1;

        builder.append("<");

        while (!queue.isEmpty()) {
            if (count == k) {
                builder.append(queue.poll());
                if (!queue.isEmpty()) {
                    builder.append(", ");
                }
                count = 0;
            } else {
                queue.offer(queue.poll());
            }
            count++;
        }

        builder.append(">");

        System.out.print(builder);

        sc.close();
    }

}
