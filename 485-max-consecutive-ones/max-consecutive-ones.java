class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int right = 0, left = 0, maxLength = 0, ones = 0;

       while(right < nums.length){
        
        //To shift left pointer
        if(nums[right] == 0){
            left = right + 1;
        }

        maxLength = Math.max(maxLength, right-left+1);
        
        right++;
       }

       return maxLength; 
    }
}