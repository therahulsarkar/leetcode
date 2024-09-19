class Solution {
    public int jump(int[] nums) {
        int left = 0, right = 0, totalJumps = 0;
        int goal = nums.length-1;

        while(right < goal){
            int farthestPossibleIndex = 0;
            //Loop to calculate the farthest possible index from current window
            for(int i = left; i<=right; i++){
                farthestPossibleIndex = Math.max(farthestPossibleIndex, nums[i]+i); //Fastest possible index from current index
            }
            left = right + 1; //left will now point to the next of current farthest
            right = farthestPossibleIndex; //right will now point to the new farthest index
            totalJumps++;
        }
        return totalJumps;
    }
}