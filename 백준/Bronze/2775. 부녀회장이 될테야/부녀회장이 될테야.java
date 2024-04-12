import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        //    1호 2호 3호
        // 2층 1 4 10
        // 1층 1 3 6 10 15
        // 0층 1 2 3 4 5
        // f(a, b) = f(a-1, b) + f(a, b-1);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] apartments = new int[15][15];

        for (int i = 0; i < 15; i++) {
            apartments[i][0] = 1;
        }

        for (int j = 0; j < 15; j++) {
            apartments[0][j] = j + 1;
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                apartments[i][j] = apartments[i - 1][j] + apartments[i][j - 1];
            }
        }

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            bw.write(String.valueOf(apartments[k][n - 1]));
            bw.newLine();
        }

        br.close();
        bw.close();
    }

}
