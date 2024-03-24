import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String numbers = br.readLine();
        while (!"0".equals(numbers)) {
            String result = "yes";

            for (int i = 0; i < numbers.length() / 2; i++) {
                if (numbers.charAt(i) != numbers.charAt(numbers.length() - 1 - i)) {
                    result = "no";
                    break;
                }
            }

            bw.write(result);
            bw.newLine();
            numbers = br.readLine();
        }


        br.close();
        bw.close();
    }

}
