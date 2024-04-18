import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[][] coordinates = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            coordinates[i][0] = x;
            coordinates[i][1] = y;
        }

        Arrays.sort(coordinates, (o1, o2) -> {
            if (o2[1] == o1[1]) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });

        for (int[] coordinate : coordinates) {
            bw.write(coordinate[0] + " " + coordinate[1]);
            bw.newLine();
        }

        br.close();
        bw.close();
    }

}
