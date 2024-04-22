import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x > 0 && y > 0) {
            sb.append(x > y ? "Yes" : "No");
            sb.append("\n");

            x = sc.nextInt();
            y = sc.nextInt();
        }

        System.out.println(sb);
    }
}
