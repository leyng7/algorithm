import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> q = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer command;

        for (int i = n; i > 0; i--) {
            command = new StringTokenizer(br.readLine());

            switch (command.nextToken()) {
                case "push_front":
                    q.addFirst(Integer.parseInt(command.nextToken()));
                    break;

                case "push_back":
                    q.addLast(Integer.parseInt(command.nextToken()));
                    break;

                case "pop_front":
                    Integer pollFirst = q.pollFirst();
                    sb.append(pollFirst == null ? -1 : pollFirst).append("\n");
                    break;

                case "pop_back":
                    Integer pollLast = q.pollLast();
                    sb.append(pollLast == null ? -1 : pollLast).append("\n");
                    break;

                case "size":
                    sb.append(q.size()).append("\n");
                    break;

                case "empty":
                    sb.append(q.isEmpty() ? 1 : 0).append("\n");
                    break;

                case "front":
                    Integer peekFirst = q.peekFirst();
                    sb.append(peekFirst == null ? -1 : peekFirst).append("\n");
                    break;

                case "back":
                    Integer peekLast = q.peekLast();
                    sb.append(peekLast == null ? -1 : peekLast).append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }

}
