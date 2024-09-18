class Solution {
    public boolean canJump(int[] nums) {
        int currMaxPossibleIndex = 0;

        for(int i = 0; i<nums.length; i++){
            if(i > currMaxPossibleIndex){
                return false;
            }else if (i + nums[i] > currMaxPossibleIndex && i <= currMaxPossibleIndex){
                currMaxPossibleIndex = i + nums[i];
            } 
        }

        return true;
    }
}