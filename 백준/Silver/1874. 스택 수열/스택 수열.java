import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int count = sc.nextInt();
        int start = 0;

        while (count > 0) {

            int number = sc.nextInt();

            if (number > start) {
                for (int i = start + 1; i <= number; i++) {
                    stack.push(i);
                    sb.append("+").append("\n");
                }
                start = number;
            } else if (stack.peek() != number) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append("-").append("\n");

            count--;
        }

        System.out.println(sb);
    }
}
