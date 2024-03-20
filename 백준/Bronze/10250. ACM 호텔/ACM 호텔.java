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

            String roomNumber = getRoomNumber(width, height, number);
            bw.write(roomNumber);
            bw.newLine();
        }

        br.close();
        bw.close();

    }

    private static String getRoomNumber(int width, int height, int number) {
        int result = 1;
        for (int w = 1; w <= width; w++) {
            for (int h = 1; h <= height; h++) {
                if (result == number) {
                    return h + String.format("%02d", w);
                }
                result++;
            }
        }
        return null;
    }

}
