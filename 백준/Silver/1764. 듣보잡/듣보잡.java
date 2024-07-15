import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int size1 = Integer.parseInt(st.nextToken());
            int size2 = Integer.parseInt(st.nextToken());

            Map<String, Integer> resultMap = new HashMap<>();

            for (int i = 0; i < size1; i++) {
                String readLine = br.readLine();
                resultMap.put(readLine, resultMap.getOrDefault(readLine, 0) + 1);
            }

            for (int i = 0; i < size2; i++) {
                String readLine = br.readLine();
                resultMap.put(readLine, resultMap.getOrDefault(readLine, 0) + 1);
            }


            List<String> filters = resultMap.entrySet().stream()
                    .filter(entry -> entry.getValue() == 2)
                    .map(Map.Entry::getKey)
                    .sorted()
                    .collect(Collectors.toList());

            bw.write(String.valueOf(filters.size()));
            bw.newLine();

            for (String filter : filters) {
                bw.write(filter);
                bw.newLine();
            }

            bw.flush();
        }
    }
}