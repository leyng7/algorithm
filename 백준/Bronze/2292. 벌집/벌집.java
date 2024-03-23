import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1 - 1
        // 6 - 7(1+6) / 2 ~ 7 은 2
        // 12 - 19(1+6+12) / 8 ~ 19 는 3
        // 18 - 37(1+6+12+18) / 20 ~ 37 은 4

        int number = Integer.parseInt(br.readLine());
        number--;

        int result = 1;

        int i = 6;
        while (number > 0) {
            result++;

            number -= i;
            i += 6;
        }

        System.out.println(result);

        br.close();
    }

}
