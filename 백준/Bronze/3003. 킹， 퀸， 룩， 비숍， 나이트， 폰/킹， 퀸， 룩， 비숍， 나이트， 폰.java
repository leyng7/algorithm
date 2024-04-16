import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        int[] chessPieces = {1, 1, 2, 2, 2, 8};

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        for (int i = 0; i < chessPieces.length; i++) {
            int number = Integer.parseInt(tokenizer.nextToken());
            builder.append(chessPieces[i] - number);

            if (i != chessPieces.length - 1) {
                builder.append(" ");
            }
        }

        System.out.println(builder);
        reader.close();

    }
}
