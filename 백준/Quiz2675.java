import java.io.*;
import java.util.StringTokenizer;

public class Quiz2675 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            String word = st.nextToken();

            for (char c : word.toCharArray()) {
                for (int j = 0; j < number; j++) {
                    bw.write(c);
                }
            }
            bw.newLine();
        }

        br.close();
        bw.close();

    }

}
