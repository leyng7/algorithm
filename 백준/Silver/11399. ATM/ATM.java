import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {


            int n = Integer.parseInt(br.readLine());
            int[] times = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                times[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(times);

            /*
            int totalWaitTime = 0;
            for (int i = 0; i < times.length; i++) {
                for (int j = 0; j < i + 1; j++) {
                    totalWaitTime += times[j];
                }
            }
            */

            int totalWaitTime = 0;
            int currentWaitTime = 0;
            for (int time : times) {
                currentWaitTime += time;
                totalWaitTime += currentWaitTime;
            }

            bw.write(String.valueOf(totalWaitTime));
            bw.flush();
        }
    }
}