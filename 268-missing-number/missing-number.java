class Solution {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        int[] result = new int[length+1];
        int answer = 0;
        for(int i=0; i<length; i++){
            result[nums[i]] = 1;
        }
        
        for(int i=0; i<result.length; i++){
            if(result[i] != 1){
                answer = i;
                break;
            }
        }
        
        return answer;
        
        
    }
}