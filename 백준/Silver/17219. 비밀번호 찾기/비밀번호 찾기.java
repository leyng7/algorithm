import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int numEntries = Integer.parseInt(st.nextToken());
            int numQueries = Integer.parseInt(st.nextToken());

            Map<String, String> passwordMap = new HashMap<>();
            for (int i = 0; i < numEntries; i++) {
                StringTokenizer entryTokenizer = new StringTokenizer(br.readLine());
                passwordMap.put(entryTokenizer.nextToken(), entryTokenizer.nextToken());
            }

            for (int i = 0; i < numQueries; i++) {
                String password = passwordMap.get(br.readLine());
                bw.write(password);
                bw.newLine();
            }

            bw.flush();
        }
    }
}