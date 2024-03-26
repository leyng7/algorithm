import java.io.IOException;
import java.util.Scanner;

public class Main {

    // 참고
    // https://www.acmicpc.net/problem/10430
    // https://soy3on.tistory.com/284

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int multiple = 0;

            int i = 0;
            while (true) {
                i++;
                multiple = (multiple * 10 + 1) % n;

                if (multiple == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }

        sc.close();
    }
}
