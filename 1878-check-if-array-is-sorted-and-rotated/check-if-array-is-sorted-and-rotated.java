class Solution {
    public boolean check(int[] nums) {
        int violation = 0;
        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                violation += 1;
                if (violation > 1)
                    return false;
            }
        }
        return true;
    }
}