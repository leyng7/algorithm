import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {

            int numEntries = Integer.parseInt(br.readLine());
            int[][] fibCounts = new int[41][2];

            fibCounts[0][0] = 1;
            fibCounts[0][1] = 0;
            fibCounts[1][0] = 0;
            fibCounts[1][1] = 1;

            for (int i = 2; i <= 40; i++) {
                fibCounts[i][0] = fibCounts[i-1][0] + fibCounts[i-2][0];
                fibCounts[i][1] = fibCounts[i-1][1] + fibCounts[i-2][1];
            }

            for (int i = 0; i < numEntries; i++) {
                int n = Integer.parseInt(br.readLine());
                bw.write(fibCounts[n][0] + " " + fibCounts[n][1]);
                bw.newLine();
            }

            bw.flush();
        }
    }

}