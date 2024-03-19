import java.io.*;

public class Quiz2562 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0;
        int order = 1;

        for (int i = 1; i < 10; i++) {
            int read = Integer.parseInt(br.readLine());
            if (read > max) {
                max = read;
                order = i;
            }
        }

        bw.write(String.valueOf(max));
        bw.newLine();
        bw.write(String.valueOf(order));

        br.close();
        bw.close();
    }

}
