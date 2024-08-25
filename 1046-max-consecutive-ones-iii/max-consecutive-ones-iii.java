class Solution {
    public int longestOnes(int[] nums, int k) {

       int right = 0, left = 0, maxLength = 0, zeros = 0;

       while(right < nums.length){
        if(nums[right] == 0) zeros++;

        //To shift left pointer
        while(zeros > k){
            if(nums[left] == 0){
                zeros--;
            }
            left++;
        }

        if(zeros <= k){
            maxLength = Math.max(maxLength, right-left+1);
        }

        right++;
       }

       return maxLength; 
    }
}