import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int height = Integer.parseInt(st.nextToken());
            int width = Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());

            int floor = number % height;
            int room = number / height + 1;

            if (floor == 0) {
                room--;
                floor = height;
            }

            bw.write(String.valueOf(floor * 100 + room));
            bw.newLine();
        }

        br.close();
        bw.close();

    }
}


