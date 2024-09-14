class Solution {
    public int maximumDifference(int[] nums) {
        int left = nums[0];
        int max = 0;

        for(int i = 1; i<nums.length; i++){
            if(nums[i] > left){
                max = Math.max(max, nums[i] - left);
            } else if(nums[i] < left){
                left = nums[i];
            }
        }

        return max == 0 ? -1 : max;
    }
}