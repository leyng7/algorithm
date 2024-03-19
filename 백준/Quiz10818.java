import java.io.*;
import java.util.StringTokenizer;

public class Quiz10818 {

    public static void main(String[] args) throws IOException {

        int min = 1000000;
        int max = -1000000;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()) {
            int number = Integer.parseInt(st.nextToken());
            if (min > number) min = number;
            if (max < number) max = number;
        }
        // Math

        bw.write(min + " " + max);

        br.close();
        bw.close();

    }

}
