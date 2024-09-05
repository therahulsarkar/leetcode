class Solution {

    public int solve(String s1, String s2, int i, int j, int[][] dp) {
        if (j < 0) return 1; 
        if (i < 0) return 0; 

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (s1.charAt(i) == s2.charAt(j)) {
            dp[i][j] = solve(s1, s2, i - 1, j - 1, dp) + solve(s1, s2, i - 1, j, dp);
        } else {
            dp[i][j] = solve(s1, s2, i - 1, j, dp);
        }

        return dp[i][j];
    }

    public int numDistinct(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();

        int dp[][] = new int[len1][len2];

        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        return solve(s, t, len1 - 1, len2 - 1, dp);
    }
}
