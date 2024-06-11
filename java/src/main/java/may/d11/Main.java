package may.d11;

public class Main {

    public static void main(String[] args) {
        System.out.println(maxUncrossedLines(new int[]{1, 3, 7, 1, 7, 5}, new int[]{1, 9, 2, 5, 1}));
    }

    /**
     * Longest Common Subsequence [Iterative DP]
     * @param nums1 elem 1
     * @param nums2 elem 2
     * @return max len of common subsequence
     */
    public static int maxUncrossedLines(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int[][] memo = new int[n1 + 1][n2 + 1];
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (nums1[i - 1] == nums2[j - 1])
                    memo[i][j] = memo[i - 1][j - 1] + 1;
                else
                    memo[i][j] = Math.max(memo[i - 1][j], memo[i][j - 1]);
            }
        }
        return memo[n1][n2];
    }
}
