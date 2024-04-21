import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int count = sc.nextInt();



        for (int i = 0; i < count; i++) {
            String word = sc.next();
            sb.append(word.charAt(0));
            sb.append(word.charAt(word.length() - 1));
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
