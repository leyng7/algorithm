import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int result = 0;

        for (int i = 0; i < count; i++) {
            if (check(sc.next())) result++;
        }

        System.out.println(result);
    }

    private static boolean check(String word) {

        boolean[] isNotFirstSpellings = new boolean['z' - 'a' + 1];
        int prev = 0;

        for (char c : word.toCharArray()) {
            if (prev != c) {
                if (isNotFirstSpellings[c - 'a']) {
                    return false;
                }
                isNotFirstSpellings[c - 'a'] = true;
                prev = c;
            }
        }

        return true;
    }

}
