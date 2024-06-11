package for_fun.jun;

public class Main {
    // largest square identity submatrix
    public static void main(String[] args) {
        System.out.println(solve(new String[]{"10100", "10111", "11111", "10010"}));
    }


    public static int solve(String[] strArr) {
        int area = 1;

        for (int row = 0; row < strArr.length; row++) {
            for (int col = 0; col < strArr[row].length(); col++) {
                if (strArr[row].charAt(col) == '1') {
                    int tmpArea = getArea(strArr, row, col);
                    area = Math.max(area, tmpArea);
                }
            }
        }

        return area;
    }

    private static int getArea(String[] strArr, int row, int col) {
        int tempRow = row, tempCol = col, area = 1;

        while (tempRow + 1 < strArr.length && tempCol + 1 < strArr[0].length()) {
            if (strArr[tempRow + 1].charAt(col) == '1' && strArr[row].charAt(tempCol + 1) == '1') {
                tempRow++;
                tempCol++;
                if (!isIdentity(strArr, row, col, tempRow, tempCol))
                    return area * area;
                area++;
            } else return area * area;
        }
        return area * area;
    }

    private static boolean isIdentity(String[] arr, int row, int col, int rowLimit, int colLimit) {
        for (int i = row; i <= rowLimit; i++)
            for (int j = col; j <= colLimit; j++)
                if (arr[i].charAt(j) != '1')
                    return false;
        return true;
    }
}

