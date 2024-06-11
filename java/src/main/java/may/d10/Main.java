package may.d10;

public class Main {
    public static void main(String[] args) {
        for (int[] row : generateMatrix(4)) {
            for (int num : row) {
                System.out.printf("%s ", num);
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int[] dr = { 0, 1, 0, -1 };
        int[] dc = { 1, 0, -1, 0 };
        int x = 0, y = 0, di = 0, target = n * n, val = 1;
        while (val <= target) {
            matrix[x][y] = val;
            int cr = x + dr[di];
            int cc = y + dc[di];

            if (0 <= cr && cr < n && 0 <= cc && cc < n
                    && matrix[cr][cc] == 0) {
                x = cr;
                y = cc;
            }
            else {
                di = (di + 1) % 4;
                x += dr[di];
                y += dc[di];
            }
            val++;
        }
        return matrix;
    }
}
