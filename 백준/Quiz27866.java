import java.util.Scanner;

public class Quiz27866 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int position = sc.nextInt();

        System.out.println(word.charAt(position - 1));

        sc.close();
    }

}
