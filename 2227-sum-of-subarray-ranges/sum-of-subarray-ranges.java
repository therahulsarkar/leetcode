class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        int minVal = 0, maxVal = 0;
        long total = 0;  

        for (int i = 0; i < nums.length; i++) {
            minVal = nums[i];
            maxVal = nums[i];

            for (int j = i; j < nums.length; j++) {
                minVal = Math.min(minVal, nums[j]);
                maxVal = Math.max(maxVal, nums[j]);
                total += (maxVal - minVal);  
            }
        }

        return total;
    }
}