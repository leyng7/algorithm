import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine() + "  ";

        int result = 0;
        
        for (int i = 0; i < word.length() - 2; i++) {

            char ch1 = word.charAt(i);
            char ch2 = word.charAt(i + 1);
            char ch3 = word.charAt(i + 2);

            if (ch1 == 'c') {
                if (ch2 == '=') {
                    i++;
                }
                if (ch2 == '-') {
                    i++;
                }
            }

            if (ch1 == 'd') {
                if (ch2 == 'z' && ch3 == '=') {
                    i += 2;
                }
                if (ch2 == '-') {
                    i++;
                }
            }

            if (ch1 == 'l' && ch2 == 'j') {
                i++;
            }

            if (ch1 == 'n' && ch2 == 'j') {
                i++;
            }

            if (ch1 == 's' && ch2 == '=') {
                i++;
            }

            if (ch1 == 'z' && ch2 == '=') {
                i++;
            }

            result++;
        }

        bw.write(String.valueOf(result));

        bw.close();
        br.close();
    }


}
