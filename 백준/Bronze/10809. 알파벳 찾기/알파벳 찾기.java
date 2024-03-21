import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // a - 97, z - 122 (25개)

        int[] alphabets = new int[26];
        Arrays.fill(alphabets, -1);

        char[] charArray = br.readLine().toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            int position = charArray[i] - 97;
            if (alphabets[position] == -1) {
                alphabets[position] = i;
            }
        }

        for (int alphabet : alphabets) {
            bw.write(alphabet + " ");
        }

        br.close();
        bw.close();

    }
}
