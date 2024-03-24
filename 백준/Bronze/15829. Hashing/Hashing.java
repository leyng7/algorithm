import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        String words = br.readLine();

        BigInteger sum = new BigInteger("0");
        for (int i = 0; i < size; i++) {
            BigInteger position = BigInteger.valueOf(words.charAt(i) - 96);
            BigInteger term = position.multiply(BigInteger.valueOf(31).pow(i));
            sum = sum.add(term);
        }

        System.out.println(sum.remainder(new BigInteger("1234567891")));
        br.close();
    }


}
