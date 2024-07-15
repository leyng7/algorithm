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

            int inputSize = Integer.parseInt(st.nextToken());
            int quizSize = Integer.parseInt(st.nextToken());

            String[] pokemonNames = new String[inputSize];
            Map<String, Integer> pokemonMap = new HashMap<>();

            for (int i = 0; i < inputSize; i++) {
                String name = br.readLine();
                pokemonNames[i] = name;
                pokemonMap.put(name, i + 1);
            }

            for (int i = 0; i < quizSize; i++) {
                String line = br.readLine();

                try {
                    int number = Integer.parseInt(line);
                    bw.write(pokemonNames[number - 1]);
                } catch (NumberFormatException e) {
                    if (pokemonMap.containsKey(line)) {
                        bw.write(String.valueOf(pokemonMap.get(line)));
                    }
                } finally {
                    bw.newLine();
                }
            }

            bw.flush();
        }
    }
}