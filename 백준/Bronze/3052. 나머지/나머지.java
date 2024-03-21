import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] remainders = new int[42];

        for (int i = 0; i < 10; i++) {
            int number = Integer.parseInt(br.readLine());
            int remainder = number % 42;
            remainders[remainder]++;
        }

        int result = 0;
        for (int remainder : remainders) {
            if (remainder > 0) {
                result++;
            }
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.close();

    }
}
