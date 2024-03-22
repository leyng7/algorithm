import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String numbersStr = br.readLine();
            
            if ("0 0 0".equals(numbersStr)) {
                break;
            }

            StringTokenizer st = new StringTokenizer(numbersStr);
            int line1 = Integer.parseInt(st.nextToken());
            int line2 = Integer.parseInt(st.nextToken());
            int line3 = Integer.parseInt(st.nextToken());

            int[] numbers = {line1 * line1, line2 * line2, line3 * line3};
            Arrays.sort(numbers);

            if ((numbers[2] == numbers[0] + numbers[1])) {
                bw.write("right");
            } else {
                bw.write("wrong");
            }

            bw.newLine();
        }


        br.close();
        bw.close();

    }
}
