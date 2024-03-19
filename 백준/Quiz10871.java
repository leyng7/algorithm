import java.io.*;
import java.util.StringTokenizer;

public class Quiz10871 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String readLine = br.readLine();
        StringTokenizer st = new StringTokenizer(readLine);

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        String numbers = br.readLine();

        StringTokenizer numberTokens = new StringTokenizer(numbers);

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(numberTokens.nextToken());
            if (number < x) {
                bw.write(number + " ");
            }
        }

        br.close();
        bw.close();
    }

}
