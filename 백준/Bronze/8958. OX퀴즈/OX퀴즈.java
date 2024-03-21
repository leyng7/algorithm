import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String words = br.readLine();
            int score = 0;
            int result = 0;
            for (String word : words.split("")) {
                if ("O".equals(word)) {
                    score++;
                    result += score;
                } else {
                    score = 0;
                }
            }
            bw.write(String.valueOf(result));
            bw.newLine();
        }

        br.close();
        bw.close();

    }
}
