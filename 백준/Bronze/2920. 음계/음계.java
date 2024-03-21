import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String numbers = br.readLine();
        StringTokenizer st = new StringTokenizer(numbers);

        int result = 0;
        int prevNumber = Integer.parseInt(st.nextToken());
        while (st.hasMoreTokens()) {
            int nextNumber = Integer.parseInt(st.nextToken());
            if (nextNumber > prevNumber) {
                result++;
            } else {
                result--;
            }
            prevNumber = nextNumber;
        }

        if (result == 7) {
            bw.write("ascending");
        } else if (result == -7) {
            bw.write("descending");
        } else {
            bw.write("mixed");
        }

        br.close();
        bw.close();

    }
}
