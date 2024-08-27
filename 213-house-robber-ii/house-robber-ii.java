class Solution {
    public static int sol(int n, int[] nums, int[] dp, int start){
		if(n == start) return nums[start];
		if(n < start) return 0;
		if(dp[n] != -1) return dp[n];

		int pick = nums[n] + sol(n-2, nums, dp, start);		
		int not_pick = 0 + sol(n-1, nums, dp, start);

		return dp[n] = Math.max(pick, not_pick);

	}
    public int rob(int[] nums) {

		int n = nums.length;

        if (n == 1) return nums[0];

		int dp1[] = new int[n];
		Arrays.fill(dp1, -1);
        int case1 = sol(n-2, nums, dp1, 0);

        int dp2[] = new int[n];
		Arrays.fill(dp2, -1);
        int case2 = sol(n-1, nums, dp2, 1);


		return Math.max(case1, case2);

	
    }
}