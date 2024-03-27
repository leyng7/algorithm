import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            bw.write(checkVps(sc.next().split("")));
            bw.newLine();
        }

        bw.close();
        sc.close();
    }

    private static String checkVps(String[] words) {
        Stack<String> stack = new Stack<>();
        for (String word  : words) {
            if ("(".equals(word)) {
                stack.push(word);
            } else if (stack.isEmpty()) {
                return "NO";
            } else {
                stack.pop();
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }
}
