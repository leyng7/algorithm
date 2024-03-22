import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;
        for (int i = 0; i < count; i++) {
            int token = Integer.parseInt(st.nextToken());
            if (token == 1) continue;

            result++;
            for (int j = 2; j < token; j++) {
                if (token % j == 0) {
                    result--;
                    break;
                }
            }
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.close();

    }
}
