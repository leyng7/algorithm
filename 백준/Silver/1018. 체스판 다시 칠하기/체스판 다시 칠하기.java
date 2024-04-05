import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int numRows = Integer.parseInt(tokenizer.nextToken());
        int numCols = Integer.parseInt(tokenizer.nextToken());

        int result = 64;

        boolean[][] chessboard = new boolean[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            String inputLine = br.readLine();
            for (int j = 0; j < numCols; j++) {
                chessboard[i][j] = inputLine.charAt(j) == 'W';
            }
        }

        for (int i = 0; i < numRows - 7; i++) {
            for (int j = 0; j < numCols - 7; j++) {
                int count = calculateMinimumRecoloring(chessboard, i, j);
                result = Math.min(result, count);
            }
        }

        System.out.println(result);

        br.close();
    }

    private static int calculateMinimumRecoloring(boolean[][] chessboard, int row, int col) {
        boolean square = chessboard[row][col];
        int count = 0;

        for (int i = row; i < row + 8; i++) {
            for (int j = col; j < col + 8; j++) {
                if (chessboard[i][j] != square) {
                    count++;
                }
                square = !square;
            }
            square = !square;
        }

        return Math.min(count, 64 - count);
    }
}