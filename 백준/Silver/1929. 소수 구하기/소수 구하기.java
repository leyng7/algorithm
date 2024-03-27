import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        boolean[] prime = getPrime(n);

        for (int i = m; i <= n; i++) {
            if (!prime[i]) System.out.println(i);
        }
    }

    public static boolean[] getPrime(int n) {
        boolean[] prime = new boolean[n + 1];

        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

        return prime;
    }
}
