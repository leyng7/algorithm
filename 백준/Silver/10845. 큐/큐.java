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
                case "push":
                    q.offer(Integer.parseInt(command.nextToken()));
                    break;

                case "pop":
                    Integer poll = q.poll();
                    sb.append(poll == null ? -1 : poll).append("\n");
                    break;

                case "size":
                    sb.append(q.size()).append("\n");
                    break;

                case "empty":
                    sb.append(q.isEmpty() ? 1 : 0).append("\n");
                    break;

                case "front":
                    Integer peek = q.peek();
                    sb.append(peek == null ? -1 : peek).append("\n");
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
