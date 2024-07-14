import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        boolean[] s = new boolean[20];


        for (int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            int number = 0;
            if (st.hasMoreTokens()) {
                number = Integer.parseInt(st.nextToken()) - 1;
            }

            switch (command) {
                case "add": {
                    s[number] = true;
                    break;
                }
                case "remove": {
                    s[number] = false;
                    break;
                }
                case "check": {
                    bw.write(s[number] ? "1" : "0");
                    bw.newLine();
                    break;
                }
                case "toggle": {
                    s[number] = !s[number];
                    break;
                }
                case "all": {
                    Arrays.fill(s, true);
                    break;
                }
                case "empty": {
                    Arrays.fill(s, false);
                }
            }
        }

        bw.flush();

        br.close();
        bw.close();
    }

}
