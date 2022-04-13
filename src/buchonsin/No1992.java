package buchonsin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
8
1 1 0 0 0 0 1 1
1 1 0 0 0 0 1 1
0 0 0 0 1 1 0 0
0 0 0 0 1 1 0 0
1 0 0 0 1 1 1 1
0 1 0 0 1 1 1 1
0 0 1 1 1 1 1 1
0 0 1 1 1 1 1 1
 */
public class No2630 {
    static int[][] table;
    static int white;
    static int blue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        table = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                table[i][j] = Integer.parseInt(st.nextToken());
            }
        }
//        System.out.println("table = " + Arrays.deepToString(table));
        divide(0, 0, n);
        System.out.println(white);
        System.out.println(blue);
    }

    private static void divide(int row, int col, int size) {
        if (checkColor(row, col, size)) {
            if (table[row][col] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }

        int reSize = size/2;

        divide(row, col, reSize);
        divide(row + reSize, col, reSize);
        divide(row, col + reSize, reSize);
        divide(row + reSize, col + reSize, reSize);
    }

    private static boolean checkColor(int row, int col, int size) {
        int startColor = table[row][col];
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (table[i][j] != startColor) {
                    return false;
                }
            }
        }
        return true;
    }
}
