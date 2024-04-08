import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();
        // 맵을 쓰거나 array 을 20,000,000으로 잡거나?

        StringTokenizer cards = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            String cardNumber = cards.nextToken();
            Integer value = map.getOrDefault(cardNumber, 0);
            map.put(cardNumber, value + 1);
        }

        int m = Integer.parseInt(br.readLine());

        StringTokenizer numbers = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            String number = numbers.nextToken();
            bw.write(map.getOrDefault(number, 0) + " ");
        }

        br.close();
        bw.close();
    }
}
