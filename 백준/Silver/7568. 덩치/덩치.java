import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        int[][] numbers = new int[size][2];

        for (int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            numbers[i][0] = Integer.parseInt(st.nextToken());
            numbers[i][1] = Integer.parseInt(st.nextToken());
        }

        int[] ranks = new int[size];
        Arrays.fill(ranks, 1);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) continue;

                if (numbers[i][0] < numbers[j][0] && numbers[i][1] < numbers[j][1]) {
                    ranks[i]++;
                }
            }
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < ranks.length; i++) {
            sb.append(ranks[i]);
            if (i != ranks.length - 1) {
                sb.append(" ");
            }
        }

        System.out.println(sb);

    }
}
