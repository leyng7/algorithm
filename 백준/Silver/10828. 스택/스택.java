import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        Stack stack = new Stack();

        for (int i = 0; i < count; i++) {
            stack.command(br.readLine());
        }

        br.close();
        bw.close();
    }

    private static class Stack {

        private final List<Integer> numbers = new ArrayList<>();

        public void command(String word) {
            String[] split = word.split(" ");
            switch (split[0]) {
                case "push":
                    push(Integer.parseInt(split[1]));
                    break;
                case "pop":
                    pop();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "top":
                    top();
                    break;
            }
        }

        public void push(int number) {
            numbers.add(number);
        }

        public void pop() {
            if (numbers.isEmpty()) {
                System.out.println(-1);
            } else {
                System.out.println(numbers.get(numbers.size() - 1));
                numbers.remove(numbers.size() - 1);
            }
        }

        public void size() {
            System.out.println(numbers.size());
        }

        public void empty() {
            System.out.println(numbers.isEmpty() ? 1 : 0);
        }

        public void top() {
            if (numbers.isEmpty()) {
                System.out.println(-1);
            } else {
                System.out.println(numbers.get(numbers.size() - 1));
            }
        }

    }
}
