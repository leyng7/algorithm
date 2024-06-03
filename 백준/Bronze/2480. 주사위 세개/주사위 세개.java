import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int dice1 = sc.nextInt();
        int dice2 = sc.nextInt();
        int dice3 = sc.nextInt();
        int reward = 0;

        if (dice1 == dice2 && dice2 == dice3) {
            reward = 10000 + dice1 * 1000;
        } else if (dice1 == dice2) {
            reward = 1000 + dice1 * 100;
        } else if (dice2 == dice3) {
            reward = 1000 + dice2 * 100;
        } else if (dice3 == dice1) {
            reward = 1000 + dice3 * 100;
        } else {
            int max = Math.max(Math.max(dice1, dice2), dice3);
            reward = max * 100;
        }

        System.out.println(reward);
    }

}