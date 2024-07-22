import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {

            int n = Integer.parseInt(br.readLine());
            int[] stairs = new int[n];

            for (int i = 0; i < n; i++) {
                stairs[i] = Integer.parseInt(br.readLine());
            }

            bw.write(String.valueOf(maxScore(stairs, n)));
            bw.flush();
        }
    }

    private static int maxScore(int[] stairs, int n) {
        if (n == 1) {
            return stairs[0];
        }
        if (n == 2) {
            return stairs[0] + stairs[1];
        }

        int[] dp = new int[n];
        dp[0] = stairs[0];
        dp[1] = stairs[0] + stairs[1];
        dp[2] = Math.max(stairs[1] + stairs[2], stairs[0] + stairs[2]);

        for (int i = 3; i < n; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + stairs[i - 1]) + stairs[i];
        }

        return dp[n - 1];
    }

}